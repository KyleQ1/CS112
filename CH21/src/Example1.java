public class Example1 {
    public static void main(String[] args) {
        MyStack<String> data = new MyStack<>();
        data.push("A");
        data.push("B");
        data.push("C");

        // See how peek works
        System.out.println(data.peek());
        System.out.println(data.peek());
        System.out.println(data.peek());

        System.out.println("--------------------");

        // See how pop works
        while (!data.empty()) {
            System.out.println(data.pop());
        }
    }
}
