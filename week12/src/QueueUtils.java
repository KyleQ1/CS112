import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUtils {
    public static Queue<String> build(String line) {
        Queue<String> parse = new LinkedList<>();
        String[] data = line.split("\\s+");

        Collections.addAll(parse, data);

        return parse;
    }

    public static int eval(Queue<String> s) {
        // I think it has to be converted to a stack
        // Don't see a way to do it with a queue that's easy
        Stack<String> data = toStack(s);
        Stack<Integer> digits = new Stack<>();

        while (!data.isEmpty()) {
            String current = data.pop();

            if (isNumeric(current)) {
                digits.add(Integer.parseInt(current));
            } else {
                int firstDigit = digits.pop();
                int secondDigit = digits.pop();
                switch (current) {
                    case "+":
                        digits.add(firstDigit + secondDigit);
                        break;
                    case "-":
                        digits.add(firstDigit - secondDigit);
                    break;
                    case "*":
                            digits.add(firstDigit * secondDigit);
                            break;
                }
            }
        }

        return digits.pop();
    }

    private static Stack<String> toStack(Queue<String> q) {
        Stack<String> s = new Stack<>();
        while(!q.isEmpty()) {
            s.add(q.poll());
        }

        return s;
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
