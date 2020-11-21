import java.util.EmptyStackException;

public class MyStack<E> extends AbstractLinkedStack<E> {

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public E pop() {
        if (empty()) {
            throw new EmptyStackException();
        } else {
            E value = top.value;
            top = top.next;
            return value;
        }
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        } else {
            return top.value;
        }
    }
}
