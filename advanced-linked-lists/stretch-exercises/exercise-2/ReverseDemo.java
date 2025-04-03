public class ReverseDemo {
    public static void main(String[] args) {
        System.out.println("Testing list reversal...\n");
        
        // Test Circular List
        System.out.println("Testing Circular List Reversal:");
        CircularList circularList = new CircularList();
        
        System.out.println("Empty list:");
        System.out.println("Before: " + circularList);
        circularList.reverse();
        System.out.println("After: " + circularList + "\n");
        
        System.out.println("Single element:");
        circularList.add(1);
        System.out.println("Before: " + circularList);
        circularList.reverse();
        System.out.println("After: " + circularList + "\n");
        
        System.out.println("Multiple elements:");
        circularList.add(2);
        circularList.add(3);
        circularList.add(4);
        System.out.println("Before: " + circularList);
        circularList.reverse();
        System.out.println("After: " + circularList + "\n");
        
        // Test Doubly Linked List
        System.out.println("Testing Doubly Linked List Reversal:");
        DoublyLinkedList doublyList = new DoublyLinkedList();
        
        System.out.println("Empty list:");
        System.out.println("Before: " + doublyList);
        doublyList.reverse();
        System.out.println("After: " + doublyList + "\n");
        
        System.out.println("Single element:");
        doublyList.add(1);
        System.out.println("Before: " + doublyList);
        doublyList.reverse();
        System.out.println("After: " + doublyList);
        System.out.println("Reverse traversal: " + doublyList.toStringReverse() + "\n");
        
        System.out.println("Multiple elements:");
        doublyList.add(2);
        doublyList.add(3);
        doublyList.add(4);
        System.out.println("Before: " + doublyList);
        doublyList.reverse();
        System.out.println("After: " + doublyList);
        System.out.println("Reverse traversal: " + doublyList.toStringReverse() + "\n");
        
        System.out.println("Program completed.");
    }
} 