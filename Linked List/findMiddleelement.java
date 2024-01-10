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



// Complete the printMidElement function below.



/*

For your reference:



SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)

*/



static void printMidElement(SinglyLinkedListNode head) {

if (head == null) {

            System.out.println("The linked list is empty.");

            return;

        }



        SinglyLinkedListNode slowPointer = head;

        SinglyLinkedListNode fastPointer = head;



        while (fastPointer != null && fastPointer.next != null) {

            slowPointer = slowPointer.next;

            fastPointer = fastPointer.next.next;

        }



        System.out.println(slowPointer.data);

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

printMidElement(llist.head);

}

scanner.close();

}

}