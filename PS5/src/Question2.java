import java.io.*;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a length");
        int specifiedLength = keyboard.nextInt();

        System.out.println("Names of length " + specifiedLength);

        int counter = 0;
        StringBuilder name = new StringBuilder();
        try {
            FileInputStream fstream = new FileInputStream("names.dat");
            DataInputStream inputFile = new DataInputStream(fstream);

            // WRITE TO FILE
            FileOutputStream basic = new FileOutputStream("lol.txt");
            DataOutputStream writer = new DataOutputStream(basic);

            boolean eof = false;
            while (!eof) {
                try {
                    int result = inputFile.readUnsignedByte();
                    writer.writeByte(result);
                } catch (EOFException e) {
                    eof = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(counter + " results");
    }
}
