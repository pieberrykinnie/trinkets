public class LinkedList {
    private class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + value;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void orderedInsert(int value) {
        Node curr = head;
        Node prev = null;

        while (curr != null && curr.value < value) {
            prev = curr;
            curr = curr.next;
        }

        if (prev != null) {
            prev.next = new Node(value, curr);
        } else {
            head = new Node(value, curr);
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
