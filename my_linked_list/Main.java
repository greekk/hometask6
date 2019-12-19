package com.greekk.hometask6.my_linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedListTwo = new MyLinkedList();
        MyLinkedList myLinkedListThree = myLinkedList;
        MyLinkedList myLinkedListFour = new MyLinkedList(3,5,8,1,66,25);

        myLinkedList.add(3);
        myLinkedList.add(2);
        myLinkedList.add(1);
        myLinkedList.add(5);
        myLinkedList.add(37);
        myLinkedList.add(4);
        myLinkedList.add(34);
        myLinkedList.add(25);
        myLinkedList.add(11);
        myLinkedList.add(58);
        myLinkedList.add(378);
        myLinkedList.add(41);

        myLinkedListTwo.add(3);
        myLinkedListTwo.add(2);
        myLinkedListTwo.add(1);
        myLinkedListTwo.add(5);
        myLinkedListTwo.add(37);
        myLinkedListTwo.add(4);
        myLinkedListTwo.add(34);
        myLinkedListTwo.add(25);
        myLinkedListTwo.add(11);
        myLinkedListTwo.add(58);
        myLinkedListTwo.add(378);
        myLinkedListTwo.add(41);

        //System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(5));

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.equals(myLinkedListFour));
        System.out.println(myLinkedList.equals(myLinkedListThree));
        System.out.println(myLinkedList.equals(myLinkedListTwo));
        //System.out.println(myLinkedList.get(13));

    }

}
