import java.io.*;

import java.util.*;

public class Main{

static class SinglyLinkedListNode {

public int data;

public SinglyLinkedListNode next;

public SinglyLinkedListNode(int nodeData) {

    this.data = nodeData;

    this.next = null;

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

    } else {

        this.tail.next = node;

    }



    this.tail = node;

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


// Complete the insertSortedNode function below.



/*

For your reference:



SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)

*/

static SinglyLinkedListNode insertSortedNode(SinglyLinkedListNode head,int value) {

    SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
 
 
 
     if (head == null || value < head.data) {
 
         newNode.next = head;
 
         return newNode;
 
     }
 
     SinglyLinkedListNode temp=head;
 
     while(temp!=null && temp.next!=null && temp.next.data<=value)
 
       temp=temp.next;
 
     newNode.next=temp.next;
 
     temp.next=newNode;
 
     
 
     return head;
 
 }
 
 
 
 
 private static final Scanner scanner = new Scanner(System.in);
 
 public static void main(String[] args) throws IOException {
 
 int testCases = scanner.nextInt();
 
 while (testCases-- > 0) {
 
 SinglyLinkedList llist = new SinglyLinkedList();
 
 int llistCount = scanner.nextInt();
 
 for (int i = 0; i < llistCount; i++) {
 
     int llistItem = scanner.nextInt();
 
     llist.insertNode(llistItem);
 
 }
 
 int value= scanner.nextInt();
 
 printLinkedList(insertSortedNode(llist.head,value));
 
 }
 
 scanner.close();
 
 }
 
 }

