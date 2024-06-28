public class StackDS {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean IsEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (IsEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (IsEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (IsEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.IsEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
