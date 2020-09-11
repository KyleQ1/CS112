import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;

        while (keyboard.hasNextLine()) {
            System.out.println("Enter a integer");
            try {
                try {
                    sum += keyboard.nextInt();
                } catch (InputMismatchException e) {
                    int extract = ExtractInt(keyboard.nextLine());
                    sum += extract;
                    System.out.println("Well, that's not a number but here's what I extracted: " + extract);
                }} catch (NumberFormatException e) {
                    System.out.println("There were no digits in that input.");
                    break;
                }
            System.out.println("Current sum: " + sum);
        }
            System.out.println("Final sum: " + sum);
    }

    public static int ExtractInt(String input)
    {
        return Integer.parseInt(input.replaceAll("[^0-9]", ""));
    }
}
