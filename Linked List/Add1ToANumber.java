import java.io.*;

import java.util.*;

class Main {

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



public static SinglyLinkedListNode addOneToList(SinglyLinkedListNode head) {
      // Create a dummy node with a value of 0 as the new head
      SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
      dummy.next = head;
      
      SinglyLinkedListNode lastNonNine = dummy; // Track the last node that is not 9
      
      // Traverse the linked list to find the rightmost non-9 node
      while (head != null) {
          if (head.data != 9) {
              lastNonNine = head;
          }
          head = head.next;
      }
      
      // Increment the rightmost non-9 node by 1
      lastNonNine.data++;
      
      // Update all nodes to the right of the rightmost non-9 node to have a value of 0
      SinglyLinkedListNode current = lastNonNine.next;
      while (current != null) {
          current.data = 0;
          current = current.next;
      }
      
      // If the dummy node's data is still 0, remove it
      if (dummy.data == 0) {
          return dummy.next;
      }
      
      return dummy;
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
  
  printLinkedList(addOneToList(llist.head));
  
  }
  
  scanner.close();
  
  }
  
  }