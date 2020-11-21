public class Example2 {
    public static void main(String[] args) {
        MyQueue<String> data = new MyQueue<>();

        data.enqueue("AAA");
        data.enqueue("BBB");
        data.enqueue("CCC");
        data.enqueue("DDD");

        System.out.println(data.peek());
        System.out.println("---------------------");


        while (!data.empty()) {
            System.out.println(data.dequeue());
        }
    }
}
