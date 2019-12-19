package com.greekk.hometask6.my_linked_list;

import java.util.Objects;

public class MyLinkedList {
    private Node last = null;
    private Node current = null;
    private int length;
    public boolean isEmpty;

    public MyLinkedList(){
        length = 0;
        isEmpty = true;
    }

    public MyLinkedList(int... args) {
        for (int i = 0; i < args.length; i++) {
            this.add(args[i]);
        }
    }

    public void add(int data){
        Node node = new Node(data);

        if(this.last != null){
            node.setNextNode(last);
            int index = last.getIndex();
            node.setIndex(++index);
        }
        else{
            node.setIndex(0);
            this.isEmpty = false;
        }
        this.last = node;
        this.current = node;
        this.length++;
    }

    public Node get(int index){
        if(index >= length || index < 0)
            throw new IndexOutOfBoundsException();
        while (current.getIndex()!= index) {
            next();
        }
        return current;
    }

    private void next(){
        try{
            if(!Objects.isNull(current)){
                if(!Objects.isNull(current.getNextNode())){
                    current = current.getNextNode();
                }
                else{
                    current = last;
                }
            }
            else{
                if (!Objects.isNull(last)) {
                    current = last;
                }
                else{
                    throw new NullPointerException("List is empty!");
                }
            }
        }
        catch (NullPointerException nlpe){
            System.out.println(nlpe.getMessage());
        }

    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        for (int i = 0; i < length; i++) {
            hash += get(i).hashCode();
        }
        return Objects.hash(hash);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        MyLinkedList list = (MyLinkedList)obj;
        if(list.hashCode() == hashCode()){
            for (int i = 0; i < length; i++) {
                if(!get(i).equals(list.get(i))) return false;
                else continue;
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        String result = "";
        if(this.isEmpty)
            result = super.toString();
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0) {
                result += "\n";
            }
            result += this.get(i).toString() + " ";
        }
        return result;
    }
}
