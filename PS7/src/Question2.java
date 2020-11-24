import java.util.Scanner;

public class Question2
{
    public static String ReverseWordLoop(String word) {
        char[] letters = word.toCharArray();

        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += letters[i];
        }

        return reverseWord;
    }

    public static String ReverseWord(String word) {
        if (word.length() > 1)
            return word.substring(word.length() - 1) + ReverseWord(word.substring(0, word.length() - 1));
        else
            return word;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a String");
        String word = keyboard.nextLine();

        System.out.println("Here is that String in reverse");
        System.out.println(ReverseWord(word));
    }
}
