public abstract class AbstractLinkedQueue<E> {

    protected class Node<E> {
        public E value;
        public Node<E> next;

        public Node(E v, Node<E> n) {
            value = v;
            next = n;
        }
    }

    public static class EmptyQueueException extends RuntimeException {

    }

    protected Node<E> front = null, back = null;

    public abstract void enqueue(E element);

    public abstract E dequeue();

    public abstract boolean empty();

    public abstract E peek();
}