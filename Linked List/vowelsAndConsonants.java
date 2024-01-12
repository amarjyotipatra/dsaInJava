import java.io.*;

import java.util.*;

public class Main{

    static class SinglyLinkedListNode {

        public char data;

        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(char nodeData) {

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

        public void insertNode(char nodeData) {

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



    // Complete the arrangeVowCon function below.



    /*

    For your reference:



    SinglyLinkedListNode {

    char data;

    SinglyLinkedListNode next;

    }

    If you want to create a new node with value, below constructor is defined

    public SinglyLinkedListNode(char nodeData)

    */



public static SinglyLinkedListNode arrangeVowCon(SinglyLinkedListNode head) {

    if (head == null || head.next == null) {

        return head;

    }



    // Initialize separate linked lists for vowels and consonants

    SinglyLinkedListNode vowelsHead = null;

    SinglyLinkedListNode vowelsTail = null;

    SinglyLinkedListNode consonantsHead = null;

    SinglyLinkedListNode consonantsTail = null;



    // Define a set to check for vowels

    Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));



    SinglyLinkedListNode current = head;



    while (current != null) {

        char ch = Character.toLowerCase(current.data);



        // Check if the character is a vowel

        if (vowelsSet.contains(ch)) {

            if (vowelsHead == null) {

                vowelsHead = current;

                vowelsTail = current;

            } else {

                vowelsTail.next = current;

                vowelsTail = current;

            }

        } else {

            if (consonantsHead == null) {

                consonantsHead = current;

                consonantsTail = current;

            } else {

                consonantsTail.next = current;

                consonantsTail = current;

            }

        }



        current = current.next;

    }



    // Connect the end of the vowels list to the beginning of the consonants list

    if (vowelsTail != null) {

        vowelsTail.next = consonantsHead;

    }



    // Set the end of the consonants list to null to terminate the rearranged list

    if (consonantsTail != null) {

        consonantsTail.next = null;

    }



    // Return the head of the rearranged list

    return vowelsHead != null ? vowelsHead : consonantsHead;

}






    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int testCases = scanner.nextInt();

        while (testCases-- > 0) {

            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = scanner.nextInt();

            for(int i=0;i<llistCount;i++)

                llist.insertNode(scanner.next().charAt(0));

            printLinkedList(arrangeVowCon(llist.head));

        }

        scanner.close();

    }

}