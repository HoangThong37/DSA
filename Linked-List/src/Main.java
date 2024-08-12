
public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(3);
        myLinkedList.append(2);
        myLinkedList.append(1);

        myLinkedList.printList();

        System.out.println(myLinkedList.removeLast().value);
        System.out.println("--------");

        myLinkedList.printList();

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

    }
}