import java.util.AbstractList;

public class MyArrayList<T> extends AbstractList<T> {

    // make an array to store any type of data
    private T[] data = (T[]) new Object[3];
    private int numElements = 0;

    public boolean add(T element) {
        // if we run out of space
        if (numElements == data.length) {
            // make a larger array
            T[] biggerArray = (T[]) new Object[data.length * 2];
            // copy smaller array into the bigger one
            System.arraycopy(data, 0, biggerArray, 0, data.length);
            // make the new array bigger
            data = biggerArray;
        }
        // insert element
        data[numElements] = element;
        // remember where next open space is
        numElements++;
        // return true to indicate we've modified the list
        return true;
    }

    @Override
    public T get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return numElements;
    }
}
