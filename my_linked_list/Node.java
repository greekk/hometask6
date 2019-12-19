package com.greekk.hometask6.my_linked_list;

import java.util.Objects;

public class Node {
    private int index;
    private int data;
    private Node prev;

    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString(){
        return "Node #" + this.getIndex() + " = " + this.getData()+";";
    }

    protected int getIndex() {
        return index;
    }

    protected void setIndex(int index) {
        this.index = index;
    }

    protected Node getNextNode() {
        return prev;
    }

    protected void setNextNode(Node nextNode) {
        this.prev = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode() + Objects.hash(data));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
