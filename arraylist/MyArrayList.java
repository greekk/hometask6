package com.greekk.hometask6.arraylist;

import java.lang.System;

public class MyArrayList {
    private int[] array;
    private int size;

    public MyArrayList(){
        this.array = new int[0];
        size = 0;
    }

    public MyArrayList(int size) {
        try{
            if (size > 0){
                this.array = new int[size];
                this.size = 0;
            }
            else{
                throw new Exception("An ArrayList must have a size greater than zero!");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }

    public int getSize() {
        return this.array.length;
    }

    public void add(int data){
        if(size == getSize()-1){
            doubleArray();
        }

        if(size < this.getSize()){
            this.array[size] = data;
            size++;
        }

    }

    private void doubleArray(){
        int[] array = new int[this.getSize()*2];
        System.arraycopy(this.array, 0, array, 0, this.array.length-1);
        this.array = array;
    }


}
