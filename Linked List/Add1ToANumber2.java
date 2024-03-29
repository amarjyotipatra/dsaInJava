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



// Complete the addOneToList function below.



/*

For your reference:



SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)



*/
public static SinglyLinkedListNode addOneToList(SinglyLinkedListNode head) {

    // Reverse the linked list to make it easier to add from right to left

    SinglyLinkedListNode reversedHead = reverseLinkedList(head);

    

    SinglyLinkedListNode current = reversedHead;

    int carry = 1; // Start with a carry of 1 (to add 1)



    while (current != null) {

        int sum = current.data + carry;

        current.data = sum % 10;

        carry = sum / 10; // Calculate carry for the next iteration



        if (current.next == null && carry > 0) {

            // If there's a carry after processing the most significant digit,

            // create a new node to accommodate it

            current.next = new SinglyLinkedListNode(carry);

            break;

        }



        current = current.next; // Move to the next digit

    }



    // Reverse the linked list back to its original order

    return reverseLinkedList(reversedHead);

}



// Helper function to reverse a linked list

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



    return prev;

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


