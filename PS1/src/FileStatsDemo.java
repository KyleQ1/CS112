import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStatsDemo
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a filename");
        String fileName = keyboard.nextLine();
        FileStats file = new FileStats(fileName);

        System.out.println(fileName + " has " + file.getNumLines() + " lines");

        System.out.println("Enter some text");
        String text = keyboard.nextLine();

        System.out.println(file.getNumMatchingWords(text) + " line(s) contain \"" + text + "\"");
    }
}
