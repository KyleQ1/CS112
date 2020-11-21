public class Node<E> {
  // package private
  E value;
  Node<E> next;

  public Node(E val, Node<E> n) {
    value = val;
    next = n;
  }

  public Node(E val) {
    this(val, null);
  }
}
