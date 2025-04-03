public class OrderedList {
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
    
    public OrderedList() {
        head = null;
    }
    
    // Add a value to the list in sorted order
    public void add(int value) {
        Node curr = head;
        Node prev = null;
        
        while (curr != null && curr.data < value) {
            prev = curr;
            curr = curr.next;
        }
        
        if (prev != null) {
            prev.next = new Node(value, curr);
        } else {
            head = new Node(value, curr);
        }
    }
    
    // Merge two ordered lists into a new ordered list
    public static OrderedList merge(OrderedList list1, OrderedList list2) {
        // TODO: Implement this method
        // Create a new OrderedList to store the result
        // Traverse both input lists simultaneously
        // At each step, choose the smaller value to add to the result
        // Handle remaining elements in either list
        return null;
    }
    
    @Override
    public String toString() {
        String result = "<< ";
        Node curr = head;
        
        while (curr != null) {
            result += curr + " ";
            curr = curr.next;
        }
        
        return result + ">>";
    }
} 