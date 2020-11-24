import java.util.Queue;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (keyboard.hasNextLine()) {
            System.out.println("Enter an expression in prefix form (operator comes first)");
            String line = keyboard.nextLine();
            Queue<String> q = QueueUtils.build(line);
            int result = QueueUtils.eval(q);
            System.out.println(result);
        }
        System.out.println("Exiting");
    }
}
