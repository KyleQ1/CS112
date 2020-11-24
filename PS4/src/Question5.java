import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename");

        try {
            FileInputStream fstream = new FileInputStream(keyboard.nextLine());
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;
            while (!eof) {
                try {
                    long creditCardNumber = inputFile.readLong();
                    ValidateCreditCard creditCard = new ValidateCreditCard(creditCardNumber);
                    System.out.println("Credit card number:" + creditCard);
                    System.out.println("Checksum: " + creditCard.getSum());
                    System.out.println("Card status: " + creditCard.CheckValidity());
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
