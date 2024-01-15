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



// Complete the reverseKnodes function below.



/*

For your reference:



SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)

*/

public static SinglyLinkedListNode reverseKnodes(SinglyLinkedListNode head, int k) {

    if (head == null || k <= 1) {

        return head; // No need to reverse if k is 1 or less

    }



    SinglyLinkedListNode prevGroupTail = null;

    SinglyLinkedListNode currentGroupHead = head;

    SinglyLinkedListNode currentGroupTail = head;



    int count = 1;



    // Traverse the list to reverse groups of k nodes

    while (currentGroupHead != null) {

        while (count < k && currentGroupTail.next != null) {

            currentGroupTail = currentGroupTail.next;

            count++;

        }



        SinglyLinkedListNode nextGroupHead = currentGroupTail.next;

        currentGroupTail.next = null; // Disconnect the current group from the next group



        // Reverse the current group

        reverseLinkedList(currentGroupHead);



        // Connect the reversed group to the previous group

        if (prevGroupTail != null) {

            prevGroupTail.next = currentGroupTail;

        } else {

            head = currentGroupTail; // Update the head if this is the first group

        }



        // Move pointers for the next iteration

        prevGroupTail = currentGroupHead;

        currentGroupHead = nextGroupHead;

        currentGroupTail = nextGroupHead;



        count = 1;

    }



    return head;

}



private static SinglyLinkedListNode reverseLinkedList(SinglyLinkedListNode head) {

    SinglyLinkedListNode prev = null;

    SinglyLinkedListNode current = head;

    SinglyLinkedListNode next = null;



    while (current != null) {

        next = current.next;

        current.next = prev;

        prev = current;

        current = next;

    }

    head=prev;

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

    int k=scanner.nextInt();

    printLinkedList(reverseKnodes(llist.head,k));



}

scanner.close();

}

}