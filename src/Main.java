import test.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        doublyLinkedList.append(9);
        doublyLinkedList.insert(1, 10);

        // doublyLinkedList.removeLast();

        doublyLinkedList.getLength();
        doublyLinkedList.getTail();
        doublyLinkedList.getHead();

        doublyLinkedList.printList();
    }
}