import java.util.EmptyStackException;

public abstract class AbstractLinkedStack<E> {
    protected class Node<E> {
        public E value;
        public Node<E> next;

        public Node(E v, Node<E> n) {
            value = v;
            next = n;
        }
    }

    protected Node<E> top;

    public void push(E v) {
        top = new Node<>(v, top);
    }

    public abstract boolean empty();

    public abstract E pop();

    public abstract E peek();
}
