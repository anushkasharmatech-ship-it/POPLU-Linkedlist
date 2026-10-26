# Linked List Management System
##1. Project Title
**Linked List Management System using Java**

## 2. Objective
The objective of this project is to implement and manage Singly Linked Lists and Doubly Linked Lists using Java. The project demonstrates various linked-list operations through a menu-driven console application.

## 3. Selected Programming Language
Java

## 4. Features

### Singly Linked List
- Insert a node at the beginning, end, or a specified position.
- Insert a node before or after a given value.
- Delete a node from the beginning, end, a specified position, or by value.
- Search for a value and update node data.
- Display and count nodes.
- Find the maximum, minimum, and middle node.
- Reverse and sort the linked list.
- Remove duplicate values.

### Doubly Linked List
- Insert a node at the beginning, end, or a specified position.
- Insert a node before or after a given value.
- Delete a node from the beginning, end, a specified position, or by value.
- Search for a value and update node data.
- Display nodes in forward and backward directions.
- Count nodes and find the maximum, minimum, and middle node.
- Reverse and sort the linked list.
- Remove duplicate values.

### Additional Features
- Menu-driven console interface.
- Separate methods for linked-list operations.
- Comparison option for singly and doubly linked lists.
- Handling of invalid positions and empty-list operations.

## 5. How to Run the Project

### Requirements
- Java Development Kit (JDK)
- Terminal/Command Prompt or a Java IDE

### Steps
1. Download or clone the project repository.
2. Open the project folder in a terminal.
3. Compile the Java files:

   ```bash
   javac src/*.java
   ```

4. Run the application:

   ```bash
   java -cp src Main
   ```

Alternatively, open `src/Main.java` in a Java IDE and run its `main()` method.

## 6. Implementation Details
- The project uses custom node classes to implement linked lists.
- Each singly linked-list node stores data and a reference to the next node.
- Each doubly linked-list node stores data and references to the previous and next nodes.
- Linked-list data is managed without using arrays or Java's built-in `List` collections.
- Each operation is implemented as a separate method.

## 7. Time Complexity

Let `n` represent the number of nodes.

| Operation | Time Complexity |
|---|---|
| Insert at beginning | O(1) |
| Insert at end | O(n) |
| Search | O(n) |
| Delete by value | O(n) |
| Display and count | O(n) |
| Find maximum/minimum | O(n) |
| Find middle node | O(n) |
| Reverse | O(n) |
| Sort using bubble sort | O(n²) |
| Remove duplicates | O(n²) |

*Note: Complexity may vary depending on the operation and implementation.*

## 8. Sample Output
A sample console session is available in the `sample-output/output.txt` file.

## 9. Project Structure

```text
Linked-List-Management-System/
├── src/
│   ├── Main.java
│   ├── SinglyLinkedList.java
│   └── DoublyLinkedList.java
├── sample-output/
│   └── output.txt
├── README.md
└── .gitignore
```

## 10. Author Details
- **Name:** ANUSHKA SHARMA

---

**Project:** Linked List Management System  
**Language:** Java  
**Type:** Menu-Driven Console Application
