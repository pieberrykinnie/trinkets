public class CircularList {
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
    
    public CircularList() {
        head = null;
        tail = null;
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
    }
    
    // Reverse the circular list in-place
    public void reverse() {
        // TODO: Implement this method
        // Reverse the circular list in-place
        // Update both head and tail pointers
        // Maintain the circular property
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