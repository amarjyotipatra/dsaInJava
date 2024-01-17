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
// Complete the reverseInRange function below.



/*

For your reference:



SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)

*/

static SinglyLinkedListNode reverseInRange(SinglyLinkedListNode head, int l, int r) {

    if (head == null || l == r) {

        return head;

    }



    SinglyLinkedListNode dummy = new SinglyLinkedListNode(0); // Dummy node to simplify handling of edge cases

    dummy.next = head;

    SinglyLinkedListNode prev = dummy;

    

    // Move prev to the node before the starting point (l)

    for (int i = 1; i < l; i++) {

        prev = prev.next;

    }



    // Reverse the sublist from l to r

    SinglyLinkedListNode current = prev.next;

    for (int i = l; i < r; i++) {

        SinglyLinkedListNode nextNode = current.next;

        current.next = nextNode.next;

        nextNode.next = prev.next;

        prev.next = nextNode;

    }



    return dummy.next;

}






private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) throws IOException {

int testCases = 1;

while (testCases-- > 0) {

SinglyLinkedList llist = new SinglyLinkedList();

int llistCount = scanner.nextInt();

int l = scanner.nextInt();

int r = scanner.nextInt();

for (int i = 0; i < llistCount; i++) {

    int llistItem = scanner.nextInt();

    llist.insertNode(llistItem);

}

printLinkedList(reverseInRange(llist.head,l,r));

}

scanner.close();

}

}
