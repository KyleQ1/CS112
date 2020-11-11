import java.util.Scanner;

public class CustomHashMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter any text");
        String input = keyboard.nextLine().toLowerCase();

        char[] hash = input.toCharArray();

        System.out.println("The CS112 hashcode for that string is " + HashFunction.getHash(hash));
    }
}
