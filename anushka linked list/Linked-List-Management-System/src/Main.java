import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList singly = new SinglyLinkedList();
        DoublyLinkedList doubly = new DoublyLinkedList();

        while (true) {
            System.out.println("\n====================================");
            System.out.println("     LINKED LIST MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Compare Singly vs Doubly Linked List");
            System.out.println("4. Exit");
            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1: singlyMenu(singly); break;
                case 2: doublyMenu(doubly); break;
                case 3: compareLists(); break;
                case 4:
                    System.out.println("Thank you for using Linked List Management System!");
                    return;
                default: System.out.println("Invalid choice. Please choose 1-4.");
            }
        }
    }

    private static void singlyMenu(SinglyLinkedList list) {
        while (true) {
            System.out.println("\n--- Operations on Singly Linked List ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Insert After a Node");
            System.out.println("5. Insert Before a Node");
            System.out.println("6. Delete from Beginning");
            System.out.println("7. Delete from End");
            System.out.println("8. Delete from Position");
            System.out.println("9. Delete by Value");
            System.out.println("10. Search");
            System.out.println("11. Update");
            System.out.println("12. Display");
            System.out.println("13. Count Nodes");
            System.out.println("14. Find Maximum");
            System.out.println("15. Find Minimum");
            System.out.println("16. Find Middle Element");
            System.out.println("17. Reverse");
            System.out.println("18. Sort");
            System.out.println("19. Remove Duplicates");
            System.out.println("20. Exit to Main Menu");

            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1: list.insertBeginning(readInt("Enter value: ")); break;
                case 2: list.insertEnd(readInt("Enter value: ")); break;
                case 3: list.insertAtPosition(readInt("Enter 1-based position: "), readInt("Enter value: ")); break;
                case 4: list.insertAfter(readInt("Insert after which value? "), readInt("Enter new value: ")); break;
                case 5: list.insertBefore(readInt("Insert before which value? "), readInt("Enter new value: ")); break;
                case 6: list.deleteBeginning(); break;
                case 7: list.deleteEnd(); break;
                case 8: list.deleteAtPosition(readInt("Enter 1-based position: ")); break;
                case 9: list.deleteByValue(readInt("Enter value to delete: ")); break;
                case 10:
                    int target = readInt("Enter value to search: ");
                    int position = list.search(target);
                    System.out.println(position == -1 ? "Value not found." : "Value found at position " + position + ".");
                    break;
                case 11: list.update(readInt("Enter old value: "), readInt("Enter new value: ")); break;
                case 12: list.display(); break;
                case 13: System.out.println("Number of nodes: " + list.count()); break;
                case 14:
                    Integer max = list.maximum();
                    System.out.println(max == null ? "List is empty." : "Maximum: " + max);
                    break;
                case 15:
                    Integer min = list.minimum();
                    System.out.println(min == null ? "List is empty." : "Minimum: " + min);
                    break;
                case 16:
                    Integer middle = list.middle();
                    System.out.println(middle == null ? "List is empty." : "Middle element: " + middle);
                    break;
                case 17: list.reverse(); System.out.println("List reversed."); list.display(); break;
                case 18: list.sort(); System.out.println("List sorted in ascending order."); list.display(); break;
                case 19: list.removeDuplicates(); System.out.println("Duplicate values removed."); list.display(); break;
                case 20: return;
                default: System.out.println("Invalid choice. Please choose 1-20.");
            }
        }
    }

    private static void doublyMenu(DoublyLinkedList list) {
        while (true) {
            System.out.println("\n--- Operations on Doubly Linked List ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Insert After a Node");
            System.out.println("5. Insert Before a Node");
            System.out.println("6. Delete from Beginning");
            System.out.println("7. Delete from End");
            System.out.println("8. Delete from Position");
            System.out.println("9. Delete by Value");
            System.out.println("10. Search");
            System.out.println("11. Update");
            System.out.println("12. Display Forward");
            System.out.println("13. Display Backward");
            System.out.println("14. Count Nodes");
            System.out.println("15. Find Maximum");
            System.out.println("16. Find Minimum");
            System.out.println("17. Find Middle Element");
            System.out.println("18. Reverse");
            System.out.println("19. Sort");
            System.out.println("20. Remove Duplicates");
            System.out.println("21. Exit to Main Menu");

            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1: list.insertBeginning(readInt("Enter value: ")); break;
                case 2: list.insertEnd(readInt("Enter value: ")); break;
                case 3: list.insertAtPosition(readInt("Enter 1-based position: "), readInt("Enter value: ")); break;
                case 4: list.insertAfter(readInt("Insert after which value? "), readInt("Enter new value: ")); break;
                case 5: list.insertBefore(readInt("Insert before which value? "), readInt("Enter new value: ")); break;
                case 6: list.deleteBeginning(); break;
                case 7: list.deleteEnd(); break;
                case 8: list.deleteAtPosition(readInt("Enter 1-based position: ")); break;
                case 9: list.deleteByValue(readInt("Enter value to delete: ")); break;
                case 10:
                    int target = readInt("Enter value to search: ");
                    int position = list.search(target);
                    System.out.println(position == -1 ? "Value not found." : "Value found at position " + position + ".");
                    break;
                case 11: list.update(readInt("Enter old value: "), readInt("Enter new value: ")); break;
                case 12: list.displayForward(); break;
                case 13: list.displayBackward(); break;
                case 14: System.out.println("Number of nodes: " + list.count()); break;
                case 15:
                    Integer max = list.maximum();
                    System.out.println(max == null ? "List is empty." : "Maximum: " + max);
                    break;
                case 16:
                    Integer min = list.minimum();
                    System.out.println(min == null ? "List is empty." : "Minimum: " + min);
                    break;
                case 17:
                    Integer middle = list.middle();
                    System.out.println(middle == null ? "List is empty." : "Middle element: " + middle);
                    break;
                case 18: list.reverse(); System.out.println("List reversed."); list.displayForward(); break;
                case 19: list.sort(); System.out.println("List sorted in ascending order."); list.displayForward(); break;
                case 20: list.removeDuplicates(); System.out.println("Duplicate values removed."); list.displayForward(); break;
                case 21: return;
                default: System.out.println("Invalid choice. Please choose 1-21.");
            }
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) return sc.nextInt();
            System.out.println("Please enter a valid integer.");
            sc.next();
        }
    }

    private static void compareLists() {
        System.out.println("\n--- Singly vs Doubly Linked List ---");
        System.out.println("Singly Linked List:");
        System.out.println("- Each node stores data and a next reference.");
        System.out.println("- Traversal is forward only.");
        System.out.println("- Uses less memory per node.");
        System.out.println("- Deleting the last node requires finding its predecessor.");
        System.out.println("\nDoubly Linked List:");
        System.out.println("- Each node stores data, next, and prev references.");
        System.out.println("- Traversal is possible in both directions.");
        System.out.println("- Uses more memory per node.");
        System.out.println("- Deleting a known node is easier because its previous node is linked.");
    }
}
