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
// Complete the findPair() function below.



/*

For your reference:



SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)

*/

static int findPair(SinglyLinkedListNode head, int k) {

    int count = 0; // Initialize the count of pairs to 0.



    // Convert the linked list to an array for easier access to elements.

    ArrayList<Integer> list = new ArrayList<>();

    SinglyLinkedListNode current = head;

    while (current != null) {

        list.add(current.data);

        current = current.next;

    }



    // Sort the array to use the two-pointer approach.

    Collections.sort(list);



    int left = 0; // Initialize the left pointer to the start of the array.

    int right = list.size() - 1; // Initialize the right pointer to the end of the array.



    while (left < right) {

        int sum = list.get(left) + list.get(right);



        if (sum == k) {

            count++;

            left++;

            right--;

        } else if (sum < k) {

            left++;

        } else {

            right--;

        }

    }



    return count;

}






private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) throws IOException {

int testCases = 1;

while (testCases-- > 0) {

SinglyLinkedList llist = new SinglyLinkedList();

int llistCount = scanner.nextInt();

int k = scanner.nextInt();

for (int i = 0; i < llistCount; i++) {

    int llistItem = scanner.nextInt();

    llist.insertNode(llistItem);

}

System.out.println(findPair(llist.head,k));

}

scanner.close();

}

}
