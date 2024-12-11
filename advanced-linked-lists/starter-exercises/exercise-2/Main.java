// Finish the method in LinkedList.java before running this program.

class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.out.println("Linked list with normal nodes:");
        ll.insert(1);
        ll.insert(2);
        ll.insert(5);
        ll.insert(5);
        ll.insert(4);

        System.out.println("Expected output: << 1 2 5 5 4 >>");
        System.out.println("Your output: " + ll + "\n");

        System.out.println("Linked list with two nodes:");
        ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);

        System.out.println("Expected output: << 1 2 >>");
        System.out.println("Your output: " + ll + "\n");

        System.out.println("Linked list with a single node:");
        ll = new LinkedList();
        ll.insert(1);

        System.out.println("Expected output: << 1 >>");
        System.out.println("Your output: " + ll + "\n");

        System.out.println("Empty linked list:");
        ll = new LinkedList();

        System.out.println("Expected output: << 1 >>");
        System.out.println("Your output: " + ll + "\n");

        System.out.println("Program completed.");
    }
}
