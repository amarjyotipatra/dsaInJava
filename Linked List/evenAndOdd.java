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

// Complete the reverseEvenEnd function below.



/*

For your reference:



SinglyLinkedListNode {

int data;

SinglyLinkedListNode next;

}

To create a new node use below constructor

public SinglyLinkedListNode(int nodeData)

*/



public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

    SinglyLinkedListNode prev = null;

    SinglyLinkedListNode curr = head;

    SinglyLinkedListNode next = null;





    while (curr != null) {

        next = curr.next;

        curr.next = prev;

        prev = curr;

        curr = next;

    }





    return prev;

}









static SinglyLinkedListNode reverseEvenEnd(SinglyLinkedListNode head) {

            SinglyLinkedListNode heado = new SinglyLinkedListNode(-1);

    SinglyLinkedListNode tempo = heado;

    SinglyLinkedListNode heade = new SinglyLinkedListNode(-1);

    SinglyLinkedListNode tempe = heade;

    SinglyLinkedListNode temp = head;





    while (temp != null) {

        if (temp.data % 2 == 0) {

            SinglyLinkedListNode te = new SinglyLinkedListNode(temp.data);

            tempe.next = te;

            tempe = tempe.next;

        } else {

            SinglyLinkedListNode to = new SinglyLinkedListNode(temp.data);

            tempo.next = to;

            tempo = tempo.next;

        }

        temp = temp.next;

    }





    tempe = reverse(heade.next);

    tempo.next = tempe;

    return heado.next;





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

printLinkedList(reverseEvenEnd(llist.head));

}

scanner.close();

}

}
