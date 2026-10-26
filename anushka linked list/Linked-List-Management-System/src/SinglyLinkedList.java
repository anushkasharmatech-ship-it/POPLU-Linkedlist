public class SinglyLinkedList {
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head;

    public void insertBeginning(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        System.out.println("Inserted " + value + " at beginning.");
    }

    public void insertEnd(int value) {
        Node node = new Node(value);
        if (head == null) { head = node; }
        else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = node;
        }
        System.out.println("Inserted " + value + " at end.");
    }

    public void insertAtPosition(int position, int value) {
        int n = count();
        if (position < 1 || position > n + 1) { System.out.println("Invalid position."); return; }
        if (position == 1) { insertBeginning(value); return; }
        Node current = head;
        for (int i = 1; i < position - 1; i++) current = current.next;
        Node node = new Node(value);
        node.next = current.next;
        current.next = node;
        System.out.println("Inserted " + value + " at position " + position + ".");
    }

    public void insertAfter(int target, int value) {
        Node current = head;
        while (current != null && current.data != target) current = current.next;
        if (current == null) { System.out.println("Target value not found."); return; }
        Node node = new Node(value);
        node.next = current.next;
        current.next = node;
        System.out.println("Inserted " + value + " after " + target + ".");
    }

    public void insertBefore(int target, int value) {
        if (head == null) { System.out.println("List is empty; target not found."); return; }
        if (head.data == target) { insertBeginning(value); return; }
        Node current = head;
        while (current.next != null && current.next.data != target) current = current.next;
        if (current.next == null) { System.out.println("Target value not found."); return; }
        Node node = new Node(value);
        node.next = current.next;
        current.next = node;
        System.out.println("Inserted " + value + " before " + target + ".");
    }

    public void deleteBeginning() {
        if (head == null) { System.out.println("List is empty."); return; }
        int removed = head.data;
        head = head.next;
        System.out.println("Deleted " + removed + " from beginning.");
    }

    public void deleteEnd() {
        if (head == null) { System.out.println("List is empty."); return; }
        if (head.next == null) { int removed = head.data; head = null; System.out.println("Deleted " + removed + " from end."); return; }
        Node current = head;
        while (current.next.next != null) current = current.next;
        int removed = current.next.data;
        current.next = null;
        System.out.println("Deleted " + removed + " from end.");
    }

    public void deleteAtPosition(int position) {
        int n = count();
        if (position < 1 || position > n) { System.out.println("Invalid position."); return; }
        if (position == 1) { deleteBeginning(); return; }
        Node current = head;
        for (int i = 1; i < position - 1; i++) current = current.next;
        int removed = current.next.data;
        current.next = current.next.next;
        System.out.println("Deleted " + removed + " from position " + position + ".");
    }

    public void deleteByValue(int value) {
        if (head == null) { System.out.println("List is empty."); return; }
        if (head.data == value) { deleteBeginning(); return; }
        Node current = head;
        while (current.next != null && current.next.data != value) current = current.next;
        if (current.next == null) { System.out.println("Value not found."); return; }
        current.next = current.next.next;
        System.out.println("Deleted first occurrence of " + value + ".");
    }

    public int search(int value) {
        Node current = head;
        int position = 1;
        while (current != null) {
            if (current.data == value) return position;
            current = current.next;
            position++;
        }
        return -1;
    }

    public void update(int oldValue, int newValue) {
        Node current = head;
        while (current != null && current.data != oldValue) current = current.next;
        if (current == null) { System.out.println("Value not found."); return; }
        current.data = newValue;
        System.out.println("Updated " + oldValue + " to " + newValue + ".");
    }

    public void display() {
        if (head == null) { System.out.println("List is empty."); return; }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public int count() {
        int count = 0;
        Node current = head;
        while (current != null) { count++; current = current.next; }
        return count;
    }

    public Integer maximum() {
        if (head == null) return null;
        int max = head.data;
        for (Node current = head.next; current != null; current = current.next) if (current.data > max) max = current.data;
        return max;
    }

    public Integer minimum() {
        if (head == null) return null;
        int min = head.data;
        for (Node current = head.next; current != null; current = current.next) if (current.data < min) min = current.data;
        return min;
    }

    // For even-length lists, returns the second middle element.
    public Integer middle() {
        if (head == null) return null;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
        return slow.data;
    }

    public void reverse() {
        Node previous = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void sort() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data; current.data = current.next.data; current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void removeDuplicates() {
        for (Node current = head; current != null; current = current.next) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) runner.next = runner.next.next;
                else runner = runner.next;
            }
        }
    }
}
