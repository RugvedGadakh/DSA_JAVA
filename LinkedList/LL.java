public class LL {

    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head; // Declaration of head variable

    // add-first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // Assign the new node as head if the list is empty
            return;
        }

        newNode.next = head; // Make the new node point to the current head
        head = newNode; // Update the head to the new node
    }

    // add-last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // Assign the new node as head if the list is empty
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode; // Make the last node point to the new node
    }

    // deletefirst
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // deleteLast
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node nodeLast = head.next;

        while (nodeLast.next != null) {
            nodeLast = nodeLast.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // print
    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> "); // Print the data of the current node
            currNode = currNode.next; // Move to the next node
        }
        System.out.println("Null");
    }

    // size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.print();

        list.addLast("List");
        list.print();
        list.addFirst("this");
        list.print();

        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();

        System.out.println(list.getSize());

    }
}
