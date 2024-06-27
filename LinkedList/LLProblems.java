import org.w3c.dom.Node;

public class LLProblems {

    private int size;

    LLProblems() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head;

    // add-first
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // Assign the new node as head if the list is empty
            return;
        }

        newNode.next = head; // Make the new node point to the current head
        head = newNode; // Update the head to the new node
    }

    // print
    public void print() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "--->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    // size
    public int getSize() {
        return size;
    }

    // Reverse LL
    public Node RecursiveReverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = RecursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // remove nth node from end
    public void removeNthFromEnd(int n) {
        if (head.next == null) {
            return;
        }
        if (n > size || n <= 0) {
            return;
        }
        if (n == size) {
            head = head.next;
            size--;
            return;
        }
        int indexToSesarch = size - n;
        Node prev = head;
        int i = 1;
        while (i < indexToSesarch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
    }

    // find middle
    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // check palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node mid = findMiddle(head);
        Node last = RecursiveReverse(mid.next);
        Node midCopy = last;

        Node curr = head;
        while (last != null) {
            if (last.data != curr.data) {
                RecursiveReverse(midCopy);
                return false;
            }
            last = last.next;
            curr = curr.next;
        }
        RecursiveReverse(midCopy);
        return true;
    }

    // LL has cycle
    public boolean hasCycle() {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        LLProblems list = new LLProblems();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        // list.print();
        // System.out.println();
        // list.removeNthFromEnd(4);
        // list.print();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        list.print();
        // System.out.println();
        System.out.println();
        System.out.println(list.isPalindrome());
        System.out.println();
        list.addFirst(1);
        list.addFirst(0);
        System.out.println();
        System.out.println(list.isPalindrome());
        System.out.println();
        System.out.println(list.hasCycle());
        System.out.println();

    }
}
