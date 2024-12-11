// Navigate to public String toString() to begin writing!

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insert(int data) {
        if (head != null) {
            head = new Node(data, head);
            tail.next = head;
        } else {
            head = new Node(data, head);
            head.next = head;
            tail = head;
        }
    }

    @Override
    public String toString() {
        String result = "<< ";

        // Check if list is empty

        // If not, append head's data to result

        // Iterate over every node and append their data until head is reached again

        return result + " >>";
    }

    private class Node {
        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + data;
        }
    }

}
