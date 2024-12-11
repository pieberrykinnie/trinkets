public class Example {
    public static void main(String[] args) {
        System.out.println("Initializing list:");

        LinkedList ll = new LinkedList();
        System.out.println(ll + "\n");

        System.out.println("Inserting 3:");

        ll.orderedInsert(3);
        System.out.println(ll + "\n");

        System.out.println("Inserting 5 (notice how it's inserted at the end):");

        ll.orderedInsert(5);
        System.out.println(ll + "\n");

        System.out.println("Inserting 4 (notice how it's inserted between 3 and 5):");

        ll.orderedInsert(4);
        System.out.println(ll + "\n");

        System.out.println("Inserting 4 (should be inserted next to our existing 4):");

        ll.orderedInsert(4);
        System.out.println(ll + "\n");

        System.out.println("Inserting 1 (notice how it's inserted at the start):");

        ll.orderedInsert(1);
        System.out.println(ll + "\n");

        System.out.println("Program completed.");
    }
}
