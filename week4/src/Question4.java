import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question4
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int maxNumber = 0;
        int minNumber = Integer.MAX_VALUE;
        int numberCounter = 0;

        try {
            System.out.println("Enter a filename");
            FileInputStream fstream = new FileInputStream(keyboard.nextLine());
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;
            while (!eof) {
                try {
                    int nextByte = inputFile.readInt();
                    if (nextByte > maxNumber) {
                        maxNumber = nextByte;
                    }
                    if (nextByte < minNumber) {
                        minNumber = nextByte;
                    }
                    numberCounter++;
                } catch(EOFException e){
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Found " + numberCounter + " integers.");
            System.out.println("Max: " + maxNumber);
            System.out.println("Min: " + minNumber);
        }
    }
}
