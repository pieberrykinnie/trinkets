# Advanced Linked Lists

## Starter Level

### Objectives

1. Learn how and when to keep linked lists in order.
2. Learn about doubly-linked lists and circular linked lists.
3. Practice with adding nodes to ordered linked lists.
4. Practice with creating, adding and removing nodes from doubly-linked lists.
5. Practice with creating, adding and removing nodes from circular linked lists.

### Overview

#### Ordered Linked Lists

In the [Linked Lists Stretch chapter](https://celine-latulipe-9048.trinket.io/java-active-learning-workbook#/linked-lists/linked-lists-stretch), you've experienced working with an ordered linked list. An **ordered linked list** is a linked list where its elements are stored in a sorted order. For example, the linked list may be storing an ordered list of integers, where the head holds the smallest value and each node points to the node holding the value directly after it. This ensures the head always holds the smallest value, and the node after it holds the second smallest, etc.

The main difference between an ordered linked list and an unordered linked list is their `insert()` method. Here is sample code for how an ordered insert might look like:

```java
void orderedInsert(int data) {
  Node curr = head;
  Node prev = null;

  // The loop iterates until either the end of the list, or when a node with a value larger than ours is found
  while (curr != null && curr.data < data) {
    prev = curr;
    curr = curr.next;
  }

  // Create a node with our value that points to the "correct position"
  Node newNode = new Node(data, curr);

  if (prev != null) {
    prev.next = newNode;
  } else {
    head = newNode;
  }
}
```

### Exercise 1

Practice visualizing an ordered linked list with the exercise below:

Refer to [Exercise 1](./starter-exercises/exercise-1/).

#### Circular Linked Lists

Imagine looping over your music playlist; when you reach the end of the playlist, you want the next song in the queue to be the start. A circular linked list is another variation of the linked list that allows such behavior. In more technical terms, no node in the circular linked list ever points to `null`: the final node will point to the head (in the case of there being a single node, the head will point towards itself).

A problem arises, however: How do we insert into a circular linked list? In a normal linked list, we insert at the head and point the new node towards the old head. But if we do so, we also have to change the pointer of the last node as it is still pointing towards the old head. Then, our code must look something like this:

```java
void insert(int data) {
  Node curr = head;

  // Null check, iterate until the last node (which is pointing at head) is found
  while (curr != null && curr.next != head) {
    curr = curr.next;
  }

  // Insert the new node at the head
  head = new Node(data, head);
  
  // If the list wasn't empty, point the last node to head
  if (curr != null) {
    curr.next = head;
  }
}
```

Therefore, every insertion will require iterating through the entire list: this is a very costly operation. The trick? *Keep a pointer to the final node*.

```java
class LinkedList {
  class Node {
    // ...
  }

  Node head; // our first node
  Node tail; // our last node

  LinkedList() {
    head = null;
    tail = null;
  }
}
```

A linked list that tracks the tail node is also a variation of the linked list on its own (so many options!) As long as we keep track of our tail node correctly, we can insert a new node without using any loops:

```java
void insert(int data) {
  if (head != null) {
    head = new Node(data, head);
    tail.next = head;
  } else {
    // List is empty, point both head and tail to the same node
    head = new Node(data, head);
    head.next = head;
    tail = head;
  }
}
```

### Exercise 2

Practice traversing a circular linked list by writing a `toString()` method that will return a string representation of the list.

Refer to [Exercise 2](./starter-exercises/exercise-2/).

### Exercise 3

The added complexity of keeping track of the tail node means deleting from the list will be more difficult, however. Can you try it?

Refer to [Exercise 3](./starter-exercises/exercise-3/).

#### Doubly Linked Lists

In a music playlist, you can backtrack to the song that had just been played. There is always a "Previous Song" button alongside the "Next Song" button; this is possible because every song knows about both the songs before and after it. We can apply a similar principle to our linked list, by designing our nodes to not only store a pointer to the next node, but also to the node prior:

```java
class Node {
  int data;
  Node next;
  Node prev; // the previous node in the list
}
```

The doubly linked list is another version of the linked list that is comprised of such nodes. The node structure can also be used in a linked list with a tail pointer or a circular linked list for extra flexbility, depending on the use case.

### Exercise 4

Write a `traverse()` method that will print out the content of a doubly linked list with a tail node in both forward and reverse orders.

Refer to [Exercise 4](./starter-exercises/exercise-4/).