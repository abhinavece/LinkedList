package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by BeatsAudio on 11/14/2016.
 */
 class SinglyLinkedListImpl {

     private Node head;
    private int length =0;

    public SinglyLinkedListImpl(){
        length =0;
    }

    public int ListLength(Node headNode){
        int length =0;
        Node currentNode = headNode;
        while(currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }


    public Node getHead(){
        return head;
    }

    public void insertAtBegin(Node node){
            node.setNext(head);
            head = node;
        length++;
    }

    public void insertAtEnd(Node node){

        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setNext(null);
        }
        length++;
    }

    // Adding a new value to the list at a given position

    public void insert(int data, int position){
        if(position < 0){
            position =0;
        }
        if (position > length){
            position = length;
        }

        if(head == null){
            head = new Node(data);
        }
        else if(position == 0){
            Node newNode = new Node(data);
            newNode.setNext(head);
            head = newNode;
        }
        else {
            Node temp = head;
            for (int i=1; i<position-1; i++){
                temp= temp.getNext();
            }

            Node newNode = new Node(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        length++;
    }

    public Node removeFromBegin(){
        Node node = head;
        if(node != null) {
            head = node.getNext();
            node.setNext(null);
        }
        length--;
        System.out.println("removing from beginning: "+node.getData());
        return node;
    }

    // Remove and return node from the end

    public Node removeFromEnd(){
        if(head == null){
            return null;
        }
        Node p =head, next = head.getNext(), q=null;
        if(next == null){
            head =null;
            return p;
        }
        else {
            while(p.getNext() != null){
                q=p;
                p= p.getNext();
            }
            q.setNext(null);
            System.out.println("removing from End: "+p.getData());
            length--;
            return p;
        }
    }

    // remove a node matching the specified node from the list.

/*    public void removeMatched(Node node){
        if(head == null){
            return;
        }
        if(node.equals(head)){
                head = head.getNext();
            return;
            }
        Node p=head, q= null;
        while((q = p.getNext()) != null){
            if(node.equals(q)){
                q.setNext(p.getNext());
                return;
            }
            p=q;
        }

        length--;
        System.out.println("Matched node: "+p.getData()+ " is removed.");

        }*/


// removing node from a given position

    public void remove(int position){
        if(position<0){
            position =0;
        }
        if(position > length){
            position = length;
        }
        if(position ==0){
            Node temp = head;
            head= temp.getNext();
            temp.setNext(null);
        }
        Node p =head, q= null;
        for (int i=1; i<position; i++){
            q=p;
            p=p.getNext();
        }
        q.setNext(p.getNext());
        length--;
        System.out.println("Found node at position is: "+p.getData());
    }



    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData()+ " ");
            temp = temp.getNext();
        }
    }


    public void getLength(){
        System.out.println(length);

    }



}
