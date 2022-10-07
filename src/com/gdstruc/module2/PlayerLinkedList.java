package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;

    // function to add a new player to the front of the linked list
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    // function to print and count the elements of the linked list
    public void printList() {
        System.out.print("HEAD -> ");
        PlayerNode current = head;
        int size = 0;

        //counter does not count the words "HEAD" and "NULL"

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            size++;
            current = current.getNextPlayer();
        }

        System.out.print(" NULL\n");
        System.out.print("Size: " + size + "\n");
    }

    //function to remove the first element
    public void removeFirst(){
        PlayerNode temp = head;
        head = head.getNextPlayer();
        PlayerNode current = head;
    }

    //function for contains
    public void contains(Player player){
       PlayerNode current = head;
       boolean exists = false;

        while (current != null) {

            if (current.getPlayer() == player)
            {
                exists = true;
                break;
            }

            current = current.getNextPlayer();
        }

        System.out.print(player.getName() + " exists? " + exists + "\n");

    }

    //function for index of
    public void indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        boolean exists = false;

        //starts at 0 because that's how lists are counted

        while (current != null) {

            if (current.getPlayer() == player)
            {
                exists = true;
                break;
            }
            current = current.getNextPlayer();
            index++;
        }

        if (exists)
        {
            System.out.print("Index of " + player.getName() + ": " + index + "\n");
        }
        else
        {
            System.out.print("Index of " + player.getName() + ": does not exist, no index\n");
        }
    }
}
