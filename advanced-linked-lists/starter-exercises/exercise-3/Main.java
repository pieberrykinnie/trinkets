// Finish the method in LinkedList.java before running this program.

class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert(1);
        ll.insert(2);
        ll.insert(5);
        ll.insert(5);
        ll.insert(4);

        System.out.println(ll);

        System.out.println("Delete node with value 2:");
        ll.delete(2);

        System.out.println("Expected list: << 1 5 5 4 >>");
        System.out.println("Your list: " + ll);

        System.out.println("Delete node with value 5:");
        ll.delete(5);

        System.out.println(ll);
        System.out.println("Expected list: << 1 5 4 >>");
        System.out.println("Your list: " + ll);

        System.out.println("Delete node with value 4:");
        ll.delete(4);

        System.out.println(ll);
        System.out.println("Expected list: << 1 5 >>");
        System.out.println("Your list: " + ll);

        System.out.println("Delete node with value 3:");
        ll.delete(3);

        System.out.println(ll);
        System.out.println("Expected list: << 1 5 >>");
        System.out.println("Your list: " + ll);

        System.out.println("Delete node with value 1:");
        ll.delete(1);

        System.out.println("Expected list: << 5 >>");
        System.out.println("Your list: " + ll);

        System.out.println("Program completed.");
    }
}
