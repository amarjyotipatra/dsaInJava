import java.io.*;

import java.util.*;

class Main {

static class SinglyLinkedListNode {

public int data;

public SinglyLinkedListNode next;

public SinglyLinkedListNode prev;

public SinglyLinkedListNode(int nodeData) {

    this.data = nodeData;

    this.next = null;

    this.prev = null;

}

}

static class SinglyLinkedList {

public SinglyLinkedListNode head;

public SinglyLinkedListNode tail;

public SinglyLinkedList() {

    this.head = null;

    this.tail = null;

}

public void insertNode(int nodeData) {

    SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

    if (this.head == null) {

        this.head = node;

        this.tail=node;

        this.head.next=null;

        this.head.prev=null;

        this.tail.next=null;

        this.tail.prev=null;

    } else {

        node.prev=this.tail;

        this.tail.next=node;

        this.tail=node;

        this.tail.next=null;

    }

}

}

static void printLinkedList(SinglyLinkedListNode head)

{

SinglyLinkedListNode temp=head;

while(temp!=null)

{

    System.out.print(temp.data+" ");

    temp=temp.next;

}

System.out.println();

}
