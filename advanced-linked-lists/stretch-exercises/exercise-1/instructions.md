# Instructions

In this exercise, you'll implement a method to merge two ordered linked lists while maintaining their sort order. This is a common operation when working with sorted data structures.

Your task is to implement the `merge` method in `OrderedList.java` that takes two ordered linked lists and returns a new list containing all elements in sorted order. Then, run `MergeDemo.java` to test your implementation with various test cases.

The key challenge is to efficiently traverse both lists simultaneously, always choosing the smaller value to add to the result list. You'll need to handle edge cases like empty lists and lists of different lengths. 