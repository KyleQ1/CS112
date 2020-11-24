import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a balance");
        int inputBalance = keyboard.nextInt();

        try {
            FileInputStream fstream = new FileInputStream("accounts-with-names.dat");
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;
            while (!eof) {
                try {
                    int number = inputFile.readUnsignedByte();
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
