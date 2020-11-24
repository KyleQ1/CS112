import java.util.Scanner;

public class Question1
{
    public static int SumOfNumbers(int max) {
        return max == 0 ? max : max + SumOfNumbers(max - 1);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a maximum");
        int max = keyboard.nextInt();
        System.out.println("The sum of number from 1 to " + max + " is " + SumOfNumbers(max));
    }
}
