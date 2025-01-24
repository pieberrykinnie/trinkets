class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.out.println("Empty list:");
        ll.traverse();
        System.out.println("Expected output:");
        System.out.println("Forward: ");
        System.out.println("Reverse: ");
        System.out.println();

        System.out.println("List with one node:");
        ll.insert(1);
        ll.traverse();
        System.out.println("Expected output:");
        System.out.println("Forward: 1");
        System.out.println("Reverse: 1");
        System.out.println();

        System.out.println("List with multiple nodes:");
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.traverse();
        System.out.println("Expected output:");
        System.out.println("Forward: 4 3 2 1");
        System.out.println("Reverse: 1 2 3 4");
        System.out.println();

        System.out.println("Program completed.");
    }
}