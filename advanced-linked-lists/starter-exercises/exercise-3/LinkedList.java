// Navigate to public void delete(int data) to begin writing!

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

    // Alternatively, define a helper method that search for and return a Node here.
    // What access modifier (public/private) should this method have?

    public void delete(int data) {
        // Traverse through the list until the node is found
        // OR the entire list has been traversed (when?)

        // Delete the node
    }

    @Override
    public String toString() {
        String result = "<< ";

        Node curr = head;

        while (curr != null) {
            result += curr + " ";
            curr = curr.next;
        }

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
