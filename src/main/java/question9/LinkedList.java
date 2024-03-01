package question9;

/** A class representing a linked list. */
public class LinkedList {
    private Node head, tail;

    public LinkedList() {
        head = null;
        tail = null;
    }


    /** Creates a new node with the given element and adds it to the back of the list
     *
     * @param elem new value to append to the linked list
     */
    public void append(int elem) {
        Node newNode = new Node(elem);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /** Prints all the nodes in the link list */
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.elem() + " ");
            current = current.next();
        }
        System.out.println();
    }

    /**
     * Insert a new node with the given value before the tail
     * @param value the value to insert before the tail
     */
    public void insertBeforeTail(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            System.out.println("The list is empty, no tail");
            return;
        }
       // FILL IN CODE

    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.append(35);
        list1.append(40);
        list1.append(10);
        list1.append(5);
        list1.append(1);
        System.out.println("Original linked list: ");
        list1.printNodes();
        list1.insertBeforeTail(12);
        System.out.println("After inserting 12 before the tail: ");
        list1.printNodes(); // expected to print  35 40 10 5 12 1

    }
}