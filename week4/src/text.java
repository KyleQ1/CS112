import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class text
{
    public static void main(String[] args)
    {
        try {
            PrintWriter outputfile = new PrintWriter("numbers.txt");
            outputfile.print(Integer.MAX_VALUE); // 10 bytes
            outputfile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
