package com.greekk.hometask6.arraylist;

import java.lang.System;

public class MyArrayList {
    private int[] nodes;
    private int counter;

    public MyArrayList(){
        this.nodes = new int[0];
        counter = 0;
    }

    public MyArrayList(int size) {
        try{
            if (size > 0){
                this.nodes = new int[size];
                counter = 0;
            }
            else{
                throw new Exception("An ArrayList must have a size greater than zero!");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }

    public int getSize() {
        return this.nodes.length;
    }

    public void add(int data){
        if(counter == getSize()-1){
            doubleArray();
        }

        if(counter < this.getSize()){
            this.nodes[counter] = data;
            counter++;
        }

    }

    private void doubleArray(){
        int[] array = new int[this.getSize()*2];
        System.arraycopy(nodes, 0, array, 0, nodes.length-1);
        nodes = array;
    }


}
