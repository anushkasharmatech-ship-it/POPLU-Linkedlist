public class DoublyLinkedList {
    private static class Node {
        int data;
        Node prev, next;
        Node(int data) { this.data = data; }
    }

    private Node head, tail;

    public void insertBeginning(int value) {
        Node node = new Node(value);
        if (head == null) head = tail = node;
        else { node.next = head; head.prev = node; head = node; }
        System.out.println("Inserted " + value + " at beginning.");
    }

    public void insertEnd(int value) {
        Node node = new Node(value);
        if (tail == null) head = tail = node;
        else { tail.next = node; node.prev = tail; tail = node; }
        System.out.println("Inserted " + value + " at end.");
    }

    public void insertAtPosition(int position, int value) {
        int n = count();
        if (position < 1 || position > n + 1) { System.out.println("Invalid position."); return; }
        if (position == 1) { insertBeginning(value); return; }
        if (position == n + 1) { insertEnd(value); return; }
        Node current = head;
        for (int i = 1; i < position; i++) current = current.next;
        Node node = new Node(value);
        node.prev = current.prev;
        node.next = current;
        current.prev.next = node;
        current.prev = node;
        System.out.println("Inserted " + value + " at position " + position + ".");
    }

    public void insertAfter(int target, int value) {
        Node current = head;
        while (current != null && current.data != target) current = current.next;
        if (current == null) { System.out.println("Target value not found."); return; }
        if (current == tail) { insertEnd(value); return; }
        Node node = new Node(value);
        node.prev = current;
        node.next = current.next;
        current.next.prev = node;
        current.next = node;
        System.out.println("Inserted " + value + " after " + target + ".");
    }

    public void insertBefore(int target, int value) {
        Node current = head;
        while (current != null && current.data != target) current = current.next;
        if (current == null) { System.out.println("Target value not found."); return; }
        if (current == head) { insertBeginning(value); return; }
        Node node = new Node(value);
        node.next = current;
        node.prev = current.prev;
        current.prev.next = node;
        current.prev = node;
        System.out.println("Inserted " + value + " before " + target + ".");
    }

    public void deleteBeginning() {
        if (head == null) { System.out.println("List is empty."); return; }
        int removed = head.data;
        if (head == tail) head = tail = null;
        else { head = head.next; head.prev = null; }
        System.out.println("Deleted " + removed + " from beginning.");
    }

    public void deleteEnd() {
        if (tail == null) { System.out.println("List is empty."); return; }
        int removed = tail.data;
        if (head == tail) head = tail = null;
        else { tail = tail.prev; tail.next = null; }
        System.out.println("Deleted " + removed + " from end.");
    }

    public void deleteAtPosition(int position) {
        int n = count();
        if (position < 1 || position > n) { System.out.println("Invalid position."); return; }
        if (position == 1) { deleteBeginning(); return; }
        if (position == n) { deleteEnd(); return; }
        Node current = head;
        for (int i = 1; i < position; i++) current = current.next;
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Deleted " + current.data + " from position " + position + ".");
    }

    public void deleteByValue(int value) {
        Node current = head;
        while (current != null && current.data != value) current = current.next;
        if (current == null) { System.out.println("Value not found."); return; }
        if (current == head) { deleteBeginning(); return; }
        if (current == tail) { deleteEnd(); return; }
        current.prev.next = current.next;
        current.next.prev = current.prev;
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

    public void displayForward() {
        if (head == null) { System.out.println("List is empty."); return; }
        Node current = head;
        System.out.print("NULL <-> ");
        while (current != null) { System.out.print(current.data + " <-> "); current = current.next; }
        System.out.println("NULL");
    }

    public void displayBackward() {
        if (tail == null) { System.out.println("List is empty."); return; }
        Node current = tail;
        System.out.print("NULL <-> ");
        while (current != null) { System.out.print(current.data + " <-> "); current = current.prev; }
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
        Node current = head;
        while (current != null) {
            Node nextOriginal = current.next;
            current.next = current.prev;
            current.prev = nextOriginal;
            current = nextOriginal;
        }
        Node oldHead = head;
        head = tail;
        tail = oldHead;
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
        Node current = head;
        while (current != null) {
            Node runner = current.next;
            while (runner != null) {
                if (runner.data == current.data) {
                    Node duplicate = runner;
                    runner = runner.next;
                    if (duplicate.prev != null) duplicate.prev.next = duplicate.next;
                    if (duplicate.next != null) duplicate.next.prev = duplicate.prev;
                    if (duplicate == tail) tail = duplicate.prev;
                } else runner = runner.next;
            }
            current = current.next;
        }
    }
}
