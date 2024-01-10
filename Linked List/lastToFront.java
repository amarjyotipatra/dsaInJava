import java.io.*;

import java.util.*;

public class Main {

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
// Complete the lastElementFirst function below.



/*

For your reference:



SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)

*/

static SinglyLinkedListNode lastElementFirst(SinglyLinkedListNode head) {

    if (head == null || head.next == null) {
   
           return head;
   
       }
   
       SinglyLinkedListNode current = head;
   
       SinglyLinkedListNode previous = null;
   
   
   
       // Traverse to the last element while keeping track of the previous node.
   
       while (current.next != null) {
   
           previous = current;
   
           current = current.next;
   
       }
   
   
   
       // Move the last element to the first.
   
       previous.next = null;
   
       current.next = head;     
   
       return current;
   
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
   
   printLinkedList(lastElementFirst(llist.head));
   
   }
   
   scanner.close();
   
   }
   
   }
   