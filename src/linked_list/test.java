package linked_list;

public class test {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        System.out.println("LL before reverse():");
        myLinkedList.removeFirst();

        myLinkedList.printList();

//        myLinkedList.reverse();
//        System.out.println("\nLL after reverse():");
//        myLinkedList.printList();
    }
}
