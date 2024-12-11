# Advanced Linked Lists

## Starter Level

### Objectives

1. Learn how and when to keep linked lists in order.
2. Learn about doubly-linked lists and circular linked lists.
3. Practice with adding and removing nodes from ordered linked lists.
4. Practice with creating, adding and removing nodes from doubly-linked lists.
5. Practice with creating, adding and removing nodes from circular linked lists.

### Overview

#### Ordered Linked Lists

In the [Linked Lists Stretch chapter](https://celine-latulipe-9048.trinket.io/java-active-learning-workbook#/linked-lists/linked-lists-stretch), you've experienced working with an ordered linked list. An **ordered linked list** is a linked list where its elements are stored in a sorted order. For example, the linked list may be storing an ordered list of integers, where the head holds the smallest value and each node points to the node holding the value directly after it. This ensures the head always holds the smallest value, and the node after it holds the second smallest, etc.

The main difference between an ordered linked list and an unordered linked list is their `insert()` method. Here is sample code for how an ordered insert might look like:

```java
void orderedInsert(int value) {
  Node curr = head;
  Node prev = null;

  // The loop iterates until either the end of the list, or when a node with a value larger than ours is found
  while (curr != null && curr.value < value) {
    prev = curr;
    curr = curr.next;
  }

  // Create a node with our value that points to the "correct position"
  Node newNode = new Node(value, curr);

  if (prev != null) {
    prev.next = newNode;
  } else {
    head = newNode;
  }
}
```

Practice visualizing an ordered linked list with the exercise below:

### Exercise 1

### Exercise 2

### Exercise 3
