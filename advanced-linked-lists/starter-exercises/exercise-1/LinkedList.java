public class LinkedList {
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

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void orderedInsert(int data) {
        Node curr = head;
        Node prev = null;

        while (curr != null && curr.data < data) {
            prev = curr;
            curr = curr.next;
        }

        if (prev != null) {
            prev.next = new Node(data, curr);
        } else {
            head = new Node(data, curr);
        }
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
}
