public class MyQueue<E> extends AbstractLinkedQueue<E> {

    @Override
    public void enqueue(E element) {
        if (empty()) {
            front = back = new Node<E>(element, null);
        } else {
            back.next = new Node<E>(element, null);
            back = back.next;
        }
    }

    @Override
    public E dequeue() {
        if (empty()) {
            throw new EmptyQueueException();
        } else {
            E element = front.value;
            front = front.next;
            return element;
        }
    }

    @Override
    public boolean empty() {
        return front == null;
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new EmptyQueueException();
        } else {
            return front.value;
        }
    }
}
