# Linked List Management System

## Objective
A menu-driven Java console application demonstrating Singly Linked List and Doubly Linked List operations.

## Language
Java (standard JDK; no external libraries).

## Features
### Singly Linked List
- Insert at beginning, end, position, before a value, and after a value
- Delete from beginning, end, position, and by value
- Search, update, display, and count nodes
- Find maximum, minimum, and middle element
- Reverse, sort in ascending order, and remove duplicates

### Doubly Linked List
- The same insertion and deletion options
- Search, update, display forward and backward, and count nodes
- Find maximum, minimum, and middle element
- Reverse, sort in ascending order, and remove duplicates

### Main Menu
- Select either list
- Compare singly and doubly linked lists
- Exit the program

## How to Run
Make sure Java JDK is installed. Open a terminal in the `src` folder and run:

```bash
javac Main.java SinglyLinkedList.java DoublyLinkedList.java
java Main
```

In IntelliJ IDEA or Eclipse, create/open a Java project, place the three `.java` files in the source folder, and run `Main`.

## Implementation Notes
- Positions are 1-based.
- Search, update, delete-by-value, insert-before, and insert-after operate on the first matching value.
- For an even number of nodes, the middle operation returns the second middle node.
- Sorting uses Bubble Sort by swapping node data.
- Duplicate removal preserves the first occurrence of each value.
- The lists are implemented with custom nodes and links; Java collection list classes are not used.

## Typical Time Complexity
| Operation | Typical complexity |
|---|---|
| Insert at beginning | O(1) |
| Insert at end (singly) | O(n) |
| Insert/delete at position | O(n) |
| Search/display/count | O(n) |
| Find minimum/maximum/middle | O(n) |
| Reverse | O(n), O(1) extra space |
| Bubble sort | O(n²) |
| Simple duplicate removal | O(n²) |

## Sample Output
See `sample-output/output.txt`.

## Author
Add your name and class/section here before submission.
