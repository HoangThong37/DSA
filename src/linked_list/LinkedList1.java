package linked_list;

public class LinkedList1 {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList1(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findMiddleNode() {
        if (head == null) {
            return null;
        }

        int count = 0;
        Node temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        temp = head;
        for (int i = 0; i < count / 2; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public Node findMiddleNode1() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

/*
LL: Find Middle Node ( ** Interview Question)
    Implement a method called findMiddleNode that returns the middle node of the linked list.
    If the list has an even number of nodes, the method should return the second middle node.
    Note: this LinkedList implementation does not have a length member variable.
*/
