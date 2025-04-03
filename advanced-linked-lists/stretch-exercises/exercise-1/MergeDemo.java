public class MergeDemo {
    public static void main(String[] args) {
        System.out.println("Testing ordered list merging...\n");
        
        // Test case 1: Both lists have elements
        System.out.println("Test Case 1: Merging two non-empty lists");
        OrderedList list1 = new OrderedList();
        OrderedList list2 = new OrderedList();
        
        list1.add(1);
        list1.add(3);
        list1.add(5);
        
        list2.add(2);
        list2.add(4);
        list2.add(6);
        
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        
        OrderedList merged = OrderedList.merge(list1, list2);
        System.out.println("Merged: " + merged + "\n");
        
        // Test case 2: One list is empty
        System.out.println("Test Case 2: Merging with one empty list");
        OrderedList list3 = new OrderedList();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        
        OrderedList emptyList = new OrderedList();
        
        System.out.println("List 3: " + list3);
        System.out.println("Empty List: " + emptyList);
        
        merged = OrderedList.merge(list3, emptyList);
        System.out.println("Merged: " + merged + "\n");
        
        // Test case 3: Lists of different lengths
        System.out.println("Test Case 3: Merging lists of different lengths");
        OrderedList list4 = new OrderedList();
        OrderedList list5 = new OrderedList();
        
        list4.add(10);
        list4.add(30);
        list4.add(50);
        list4.add(70);
        
        list5.add(20);
        list5.add(40);
        
        System.out.println("List 4: " + list4);
        System.out.println("List 5: " + list5);
        
        merged = OrderedList.merge(list4, list5);
        System.out.println("Merged: " + merged + "\n");
        
        // Test case 4: Both lists are empty
        System.out.println("Test Case 4: Merging two empty lists");
        OrderedList emptyList1 = new OrderedList();
        OrderedList emptyList2 = new OrderedList();
        
        System.out.println("Empty List 1: " + emptyList1);
        System.out.println("Empty List 2: " + emptyList2);
        
        merged = OrderedList.merge(emptyList1, emptyList2);
        System.out.println("Merged: " + merged + "\n");
        
        System.out.println("Program completed.");
    }
} 