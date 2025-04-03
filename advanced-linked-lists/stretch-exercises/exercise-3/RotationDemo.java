public class RotationDemo {
    public static void main(String[] args) {
        System.out.println("Testing circular list rotation...\n");
        
        RotatableList list = new RotatableList();
        
        // Test case 1: Empty list
        System.out.println("Test Case 1: Empty list");
        System.out.println("Before: " + list);
        list.rotate(2);
        System.out.println("After rotating by 2: " + list + "\n");
        
        // Test case 2: Single element
        System.out.println("Test Case 2: Single element");
        list.add(1);
        System.out.println("Before: " + list);
        list.rotate(1);
        System.out.println("After rotating by 1: " + list);
        list.rotate(-1);
        System.out.println("After rotating by -1: " + list + "\n");
        
        // Test case 3: Multiple elements, positive rotation
        System.out.println("Test Case 3: Multiple elements, positive rotation");
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Before: " + list);
        list.rotate(2);
        System.out.println("After rotating by 2: " + list + "\n");
        
        // Test case 4: Multiple elements, negative rotation
        System.out.println("Test Case 4: Multiple elements, negative rotation");
        System.out.println("Before: " + list);
        list.rotate(-3);
        System.out.println("After rotating by -3: " + list + "\n");
        
        // Test case 5: Rotation larger than list size
        System.out.println("Test Case 5: Rotation larger than list size");
        System.out.println("Before: " + list);
        list.rotate(7);  // Should be equivalent to rotating by 2 (7 % 5)
        System.out.println("After rotating by 7: " + list + "\n");
        
        // Test case 6: Negative rotation larger than list size
        System.out.println("Test Case 6: Negative rotation larger than list size");
        System.out.println("Before: " + list);
        list.rotate(-8);  // Should be equivalent to rotating by -3 (-8 % 5)
        System.out.println("After rotating by -8: " + list + "\n");
        
        System.out.println("Program completed.");
    }
} 