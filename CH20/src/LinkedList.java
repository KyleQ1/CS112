public class LinkedList {
    private Node first, last;
    private int numElements = 0;

    // O(n)
    public String get(int index) {
        return getNode(index).value;
    }

    // O(1)
    public boolean isEmpty() {
        return first == null;
    }

    // O(n)
    public void add(int index, String v) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            first = new Node(v, first);
        } else {
            Node previous = getNode(index - 1);
            Node newItem = new Node(v, previous.next);
            previous.next = newItem;
        }

        if (last.next != null) {
            last = last.next;
        }

        numElements++;
    }

    // O(1) SUPER FAST - beats the ArrayList
    public void add(String v) {
        if (isEmpty())
            // first and last point to the same thing
            first = last = new Node(v);
        else {
            last.next = new Node(v);
            // move last forward
            last = last.next;
        }
        numElements++;
    }

    // O(n)
    public void remove() {
        remove(size() - 1);
    }

    // O(n)
    public void remove(int index) {
        if (index == 0) {
            // move first node forward, java will garbage collect the old node
            first = first.next;
        } else if (index == size() - 1) {
            Node secondToLast = getNode(size() - 1);
            secondToLast.next = null;
            last = secondToLast;
        } else {
            Node previous = getNode(index - 1);
            previous.next = previous.next.next;
        }
        numElements--;
    }

    // O(1)
    public int size() {
        return numElements;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            // make string longer
            sb.append(get(i));
            sb.append(" ");
        }

        return sb.toString();
    }

    // O(n)
    public String toStringReverse() {
        return toStringReverse(first);
    }

    // O(n) (based on size of the list)
    private String toStringReverse(Node current) {
        return current == null ? "" : toStringReverse(current.next) + current.value;
    }

    // O(n)
    private Node getNode(int index) {
        Node ref = first;
        // loop "index" times
        for (int x = 1; x <= index; x++) {
            ref = ref.next;
        }

        // return the node at position "index"
        return ref;
    }
}
