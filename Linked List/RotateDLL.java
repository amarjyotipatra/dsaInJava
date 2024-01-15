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

// Complete the rotateDoublyList function below.



/*

For your reference:

SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

SinglyLinkedListNode prev;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)

*/



static SinglyLinkedListNode rotateDoublyList(SinglyLinkedListNode head,int k) {

    if(head==null || k<0)
  
       return head;
  
    SinglyLinkedListNode current=head;
  
    while(current!=null && current.next!=null)
  
       current=current.next;
  
    current.next=head;
  
    head.prev=current;
  
    for(int i=0;i<k;i++){
  
      current=current.next;
  
      head=head.next;
  
    }
  
    head.prev=null;
  
    current.next=null;
  
    return head;
  
  }
  
  
  
  
  private static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) throws IOException {
  
  int testCases = scanner.nextInt();
  
  while (testCases-- > 0) {
  
  SinglyLinkedList llist = new SinglyLinkedList();
  
  int llistCount = scanner.nextInt();
  
  int k = scanner.nextInt();
  
  for (int i = 0; i < llistCount; i++) {
  
      int llistItem = scanner.nextInt();
  
      llist.insertNode(llistItem);
  
  }
  
  printLinkedList(rotateDoublyList(llist.head,k));
  
  }
  
  scanner.close();
  
  }
  
  }