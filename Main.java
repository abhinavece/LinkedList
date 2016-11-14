package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SinglyLinkedListImpl sl = new SinglyLinkedListImpl();
        sl.insertAtBegin(new Node(11));
        sl.insertAtBegin(new Node(10));
        sl.insertAtBegin(new Node(12));
        sl.insertAtBegin(new Node(19));
        sl.insertAtEnd(new Node(2));
        sl.insert(31,3);

/*
        sl.removeFromBegin();
        sl.removeFromEnd();
*/

     //   sl.removeMatched(new Node(12));
        sl.remove(3);

        sl.getLength();

        sl.printLinkedList();
    }
}
