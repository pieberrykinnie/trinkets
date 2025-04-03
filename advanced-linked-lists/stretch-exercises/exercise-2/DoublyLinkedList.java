public class DoublyLinkedList {
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
    
    private Node head;
    private Node tail;
    
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    
    // Add a value to the end of the doubly-linked list
    public void add(int value) {
        Node newNode = new Node(value, null, tail);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    // Reverse the doubly-linked list in-place
    public void reverse() {
        // TODO: Implement this method
        // Reverse the doubly-linked list in-place
        // Update both head and tail pointers
        // Swap next and prev pointers for each node
    }
    
    @Override
    public String toString() {
        if (head == null) {
            return "Empty list";
        }
        
        String result = "<< ";
        Node current = head;
        
        while (current != null) {
            result += current + " ";
            current = current.next;
        }
        
        return result + ">>";
    }
    
    // Helper method to verify the list is properly doubly-linked
    public String toStringReverse() {
        if (tail == null) {
            return "Empty list";
        }
        
        String result = ">> ";
        Node current = tail;
        
        while (current != null) {
            result += current + " ";
            current = current.prev;
        }
        
        return result + "<<";
    }
} 