public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data, null, null);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void traverse() {
        // Print "Forward:" then traverse from head to tail
        // Print each node's data with a space between

        // Print "Reverse:" then traverse from tail to head
        // Print each node's data with a space between
    }

    private class Node {
        public int data;
        public Node next;
        public Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }
}