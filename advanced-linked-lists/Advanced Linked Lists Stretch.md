# Advanced Linked Lists

## Stretch Level

### Objectives

1. Implement common examples of complex ordered, circular and doubly linked list operations.

### Overview

#### Merging Ordered Lists

When working with ordered linked lists, a common operation is combining two already-sorted lists while maintaining the sort order. For example, merging list `<< 1 3 5 >>` with `<< 2 4 6 >>` should produce `<< 1 2 3 4 5 6 >>`. This requires carefully tracking multiple pointers and comparing values to ensure proper ordering.

The key insight is to traverse both lists simultaneously, always choosing the smaller value to add to the result:

```java
// list1 and list2 are head nodes of two ordered linked list
// we want to return the head of the merged list
Node merge(Node list1, Node list2) {

}
```

### Exercise 1: Merge Two Ordered Lists

Implement a method that merges two ordered linked lists while maintaining sort order. Test with various cases including empty lists and lists of different lengths.

**Challenge**: There are both iterative and recursive implementations possible for this method. Can you do both?

Refer to Exercise 1.

#### List Reversal

Reversing a linked list means changing each node's next pointer to point to its previous node instead. With circular lists, we must preserve the circular property. With doubly-linked lists, we must update both next and prev pointers correctly.

The basic approach is:
1. Track previous, current and next nodes
2. For each node:
   - Save the next node
   - Point current to previous
   - Move previous and current forward

### Exercise 2: List Reversal

Implement in-place reversal for both circular and doubly-linked lists. Your method should handle edge cases like empty lists and single nodes.

Refer to Exercise 2.

#### Complex Circular Operations

Circular lists enable efficient rotations and cycle detection. A rotation by N positions means moving the first N nodes to the end (or last N nodes to front). With a tail pointer, we can do this without full traversal:

```java
void rotate(int n) {

}
```

### Exercise 3: Rotate a Circular List

Implement a method to rotate a circular list by N positions, utilizing the tail pointer efficiently. Consider both positive and negative rotation values.

Refer to Exercise 3.