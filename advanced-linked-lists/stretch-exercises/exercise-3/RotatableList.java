public class RotatableList {
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
    private Node tail;
    private int size;
    
    public RotatableList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    // Add a value to the end of the circular list
    public void add(int value) {
        Node newNode = new Node(value, null);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        
        size++;
    }
    
    // Rotate the list by N positions
    // Positive N: rotate clockwise (right)
    // Negative N: rotate counterclockwise (left)
    public void rotate(int n) {
        // TODO: Implement this method
        // Handle empty list or single node
        // Normalize n to be within the size of the list
        // Efficiently find the new head and tail
        // Update head and tail pointers
    }
    
    // Get the size of the list
    public int getSize() {
        return size;
    }
    
    @Override
    public String toString() {
        if (head == null) {
            return "Empty list";
        }
        
        String result = "<< ";
        Node current = head;
        
        do {
            result += current + " ";
            current = current.next;
        } while (current != head);
        
        return result + ">>";
    }
} 