public class LLReverse {

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("The list id empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "--->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public void ReverseIterate() {

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }

    public Node RecursiveReverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = RecursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LLReverse list = new LLReverse();
        list.addFirst("list");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.print();

        System.out.println();

        // list.ReverseIterate();
        // list.print();

        list.head = list.RecursiveReverse(list.head);
        list.print();

    }

}
