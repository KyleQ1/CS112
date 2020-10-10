import java.util.Scanner;

public class Question3
{
    public static String Palindrome(String word) {
        if (word.length() < 1)
            return word;
        else {
            String nextLetter = word.substring(word.length()-1);
            return nextLetter += Palindrome(word.substring(0, word.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = keyboard.nextLine();

        if (Palindrome(word.toLowerCase()).equalsIgnoreCase(word.toLowerCase())) {
            System.out.println("That is a palindrome");
        }
        else {
            System.out.println("That is NOT a palindrome");
        }
    }
}
