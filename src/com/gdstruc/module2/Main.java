package com.gdstruc.module2;

public class Main {
    public static void main(String[] args) {
        // add players to the ArrayList
        Player goku = new Player(1, "Goku", 9001);
        Player vegeta = new Player(2, "Vegeta", 9000);
        Player broly = new Player(3, "Broly", 20000);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);
        linkedList.addToFront(broly);

        // add one more player
        linkedList.addToFront(new Player(10, "Yamcha", 500));

        //first print out
        System.out.print( "FIRST LIST\n");

        // print the elements starting from the head and size of list
        linkedList.printList();

        //contains
        linkedList.contains(broly);

        //index of
        linkedList.indexOf(broly);

        //printing after first removal
        System.out.print( "\n" + "AFTER REMOVING FIRST ELEMENT\n");

        //remove first element
        linkedList.removeFirst();

        // print the elements starting from the head and size of list
        linkedList.printList();

        //contains
        linkedList.contains(broly);

        //index of
        linkedList.indexOf(broly);

        //printing after second removal
        System.out.print( "\n" + "AFTER REMOVING FIRST ELEMENT AGAIN\n");

        //remove first element
        linkedList.removeFirst();

        // print the elements starting from the head and size of list
        linkedList.printList();

        //contains to show that broly does not exist
        linkedList.contains(broly);

        //index of
        linkedList.indexOf(broly);

    }

}