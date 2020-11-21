public class Example1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // removes C
        list.remove(2);

        // prints all elements
        System.out.println(list);
    }
}
