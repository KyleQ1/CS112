import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class StackUtils {
    public static Stack<Character> buildStack(File f) {
        Stack<Character> curlyBrackets = new Stack<>();
        try {
            Scanner keyboard = new Scanner(f);

            while (keyboard.hasNextLine()) {
                char[] data = keyboard.nextLine().toCharArray();
                for (char datum : data) {
                    if (datum == '{' || datum == '}') {
                        curlyBrackets.add(datum);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        return curlyBrackets;
    }

    public static int reduce(File f) {
        Stack<Character> curlyBrackets = new Stack<>();

        try {
            Scanner keyboard = new Scanner(f);

            while (keyboard.hasNextLine()) {
                char[] data = keyboard.nextLine().toCharArray();

                for (char datum: data) {
                    if (datum == '{')
                        curlyBrackets.add(datum);
                    else if (datum == '}') {
                        // if there is not an opening curly bracket or the stack is empty then they are not balanced
                        if (curlyBrackets.isEmpty() || !(curlyBrackets.pop() == '{'))
                            return -1;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        // if the stack is empty then they are balanced
        if (curlyBrackets.isEmpty())
            return 0;
        else
            return -1;
    }

   /* Doesn't work
   public static int reduce(File f) {
        Stack<Character> curlyBrackets = buildStack(f);

        int opening = 0, closing = 0;
        while (!curlyBrackets.empty()) {
            char current = curlyBrackets.pop();

            if (current == '{') {
                opening++;
            } else if (current == '}') {
                closing++;
            }

        }

        return opening == closing ? 0 : 1;
    }*/
}


