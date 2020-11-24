import java.util.*;

public class Question4
{
    public static void input(Scanner inputs, ArrayList<Integer> numbers) {
        try {
            numbers.add(inputs.nextInt());
            input(inputs, numbers);
        } catch (InputMismatchException ignored) {}
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter several numbers. Enter a non-integer to end.");
        input(keyboard, numbers);
        Collections.sort(numbers);
        System.out.println("Greatest number in that sequence is " + numbers.get(numbers.size() - 1));
    }
}
