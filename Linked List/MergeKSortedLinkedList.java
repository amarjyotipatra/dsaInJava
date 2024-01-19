import java.io.*;

import java.util.*;

public class Main {

    static class SinglyLinkedListNode {

        public int data;

        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(){}

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
// Complete the mergeKLists() function below.



    /*

    For your reference:

    static class SinglyLinkedListNode {

        public int data;

        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(){}

        public SinglyLinkedListNode(int nodeData) {

            this.data = nodeData;

            this.next = null;

        }

    }



    */

    public static SinglyLinkedListNode mergeKLists(SinglyLinkedListNode[] headList) {

        if (headList == null || headList.length == 0) {

            return null;

        }



        PriorityQueue<SinglyLinkedListNode> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);



        // Initialize the min-heap with the head nodes of the K linked lists

        for (SinglyLinkedListNode head : headList) {

            if (head != null) {

                minHeap.offer(head);

            }

        }



        // Create a dummy node for the merged list

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);

        SinglyLinkedListNode current = dummy;



        // Merge the sorted linked lists

        while (!minHeap.isEmpty()) {

            SinglyLinkedListNode smallest = minHeap.poll();

            current.next = smallest;

            current = current.next;



            if (smallest.next != null) {

                minHeap.offer(smallest.next);

            }

        }



        return dummy.next;

    }




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int testCases = 1;

        while (testCases-- > 0) {

            int k=scanner.nextInt();

            SinglyLinkedListNode []headList = new SinglyLinkedListNode[k];

            int p=0;

            for(int j=0;j<k;j++) {

                SinglyLinkedList llist = new SinglyLinkedList();

                int llistCount = scanner.nextInt();

                for (int i = 0; i < llistCount; i++) {

                    int llistItem = scanner.nextInt();

                    llist.insertNode(llistItem);

                }

                headList[p++] = llist.head;

            }

           printLinkedList(mergeKLists(headList));

        }

        scanner.close();

    }

}
