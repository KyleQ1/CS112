import java.util.AbstractList;
import java.util.Random;

public class MyLinkedList<E extends Comparable<E>> extends AbstractList<E> {
    private Node<E> first, last;
    private int numElements = 0;

    public boolean isEmpty() {
        return first == null;
    }

    // O(1) SUPER FAST - beats the ArrayList
    public boolean add(E v) {
        if (isEmpty())
            // first and last point to the same thing
            first = last = new Node<>(v);
        else {
            last.next = new Node<>(v);
            // move last forward
            last = last.next;
        }

        numElements++;
        return true;
    }

    public void add(int index, E v) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0)
            first = new Node<>(v, first);
        else {
            Node<E> previous = getNode(index - 1);
            previous.next = new Node<>(v, previous.next);
        }

        if (last.next != null)
            last = last.next;

        numElements++;
    }

    public E set(int index, E v) {
        Node<E> ref = getNode(index);
        ref.value = v;

        return get(index);
    }

    @Override
    public E get(int index) {
        return getNode(index).value;
    }

    @Override
    public int size() {
        return numElements;
    }

    public E remove(int index) {
        // get the node that's removed
        E removed = get(index);

        if (index == 0) {
            // move first node forward, java will garbage collect the old node
            first = first.next;
        } else if (index == size() - 1) {
            Node<E> secondToLast = getNode(size() - 2);
            secondToLast.next = null;
            last = secondToLast;
        } else {
            Node<E> previous = getNode(index - 1);
            previous.next = previous.next.next;
        }

        numElements--;
        return removed;
    }

    public void swap(int firstValue, int secondValue) {
        Node<E> firstRef = getNode(firstValue);
        Node<E> secondRef = getNode(secondValue);

        // Make a temporary variable since the first ref's value is changed
        E temp = firstRef.value;

        firstRef.value = secondRef.value;
        secondRef.value = temp;
    }

    public void shuffle(long seed) {
        Random rng = new Random(seed);

        for (int x = 0; x < size(); x++) {
            int swapNum = rng.nextInt(size());
            swap(x, swapNum);
        }
    }

    public void reverse() {
        Node<E> previous = null;
        Node<E> current = first;
        Node<E> next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first = previous;
    }

    public E removeMinimum() {
        if (first == null)
            return null;

        Node<E> ref = first;
        E currentMin = first.value;

        for (int i = 0; i < size(); i++) {
            if (currentMin.compareTo(ref.value) > 0) {
                currentMin = ref.value;
            }
            ref = ref.next;
        }
        remove(currentMin);

        return currentMin;
    }

    public int indexOf(E v) {
        Node<E> current = first;

        for (int i = 0; i < size(); i++) {
            if (current.value.equals(v))
                return i;
            current = current.next;
        }

        return -1;
    }

    public int lastIndexOf(Object v) {
        Node<E> current = first;

        int indexOf = -1;
        for (int i = 0; i < size(); i++) {
            if (current.value.equals(v))
                indexOf = i;
            current = current.next;
        }

        return indexOf;
    }

    public void removeDuplicates() {
        Node<E> searchValue = first;

        // Go through each element
        while (searchValue != null) {
            Node<E> current = searchValue;

            // Compare the current element with the rest in the list
            for (int i = 1; i < size() - 1; i++) {
                current = current.next;

                if (current == null)
                    break;

                // if its a duplicate then delete it
                if (current.value.equals(searchValue.value)) {
                    remove(i + indexOf(searchValue.value));
                    i--;
                }
            }
            searchValue = searchValue.next;
        }
    }

    public void sort() {
        bubblesort(0, size() - 1);
    }

    private void bubblesort(int start, int end) {
        for (int i = start; i <= end; i++) {
            Node<E> currentNode = first;
            Node<E> next = first.next;
            for (int j = 0; j < size() - 1; j++) {
                if (currentNode.value.compareTo(next.value) > 0) {
                    E temp = currentNode.value;
                    currentNode.value = next.value;
                    next.value = temp;
                }
                currentNode = next;
                next = next.next;
            }
        }
    }

    // too lazy to figure out why my quicksort algorithm is not working
    // gives a null pointer exception for some reason
    private void quicksort(Node<E> start, Node<E> end) {
        if (start == end)
            return;

        // split list and partition recurse
        Node<E> previousPivot = partition(start, end);
        quicksort(start, previousPivot);

        // if pivot is picked and moved to the start,
        // that means start and pivot is the same
        // so pick from next pivot
        if (previousPivot != null && previousPivot == start)
            quicksort(previousPivot.next, end);

            // if pivot is in between of the list,
            // start from next of pivot,
            // since we have previous pivot, so we move two nodes
        else if (previousPivot != null && previousPivot.next != null)
            quicksort(previousPivot.next.next, end);
    }

    private Node<E> partition(Node<E> start, Node<E> end) {
        if (start == end || start == null || end == null)
            return start;

        Node<E> previousPivot = start;
        Node<E> current = start;
        E pivot = end.value;

        // iterate until one before the end
        // no need to iterate at end because that is the pivot
        while (start != end) {
            if (start.value.compareTo(pivot) < 0) {
                // keep track of last modified item
                previousPivot = current;
                E temp = current.value;
                current.value = start.value;
                start.value = temp;
                current = current.next;
            }
            start = start.next;
        }

        // swap the position of current
        // next suitable index and pivot
        E temp = current.value;
        current.value = pivot;
        end.value = temp;

        // return one previous to current
        // because current is now pointing to pivot
        return previousPivot;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (size() == 0)
            sb.append(" ");
        else {
            Node<E> ref = first;
            while (ref.next != null) {
                sb.append(ref.value);
                sb.append(", ");
                ref = ref.next;
            }
            // append last ref that wasn't added
            sb.append(ref.value);
        }
        sb.append("]");

        return sb.toString();
    }

    private Node<E> getNode(int index) {
        Node<E> ref = first;
        // loop "index" times
        for (int x = 1; x <= index; x++)
            ref = ref.next;

        // return the node at position "index"
        return ref;
    }
}
