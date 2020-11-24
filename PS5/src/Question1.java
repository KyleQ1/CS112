import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a balance");
        double minimumBalance = keyboard.nextDouble();

        System.out.print("Accounts with a balance of at least $");
        System.out.format("%.2f%n", minimumBalance);
        System.out.format("%20s", "Card Number");
        System.out.format("%10s", "Balance");
        System.out.format("%12s%n", "Cash Back?");

        int counter = 0;
        try {
            FileInputStream fstream = new FileInputStream("accounts.dat");
            DataInputStream inputFile = new DataInputStream(fstream);

            boolean eof = false;
            while (!eof) {
                try {
                    long cardNumber = inputFile.readLong();
                    double balance = inputFile.readDouble();
                    boolean cashBack = inputFile.readBoolean();
                    if (balance >= minimumBalance) {
                        String newBalance = String.format("%.2f", balance);
                        System.out.format("%20s", cardNumber);
                        System.out.format("%10s", newBalance);
                        if (cashBack)
                            System.out.format("%12s%n", "Yes");
                        else
                            System.out.format("%12s%n", "No");
                        counter++;
                    }
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.format("%34s", counter);
            System.out.println(" results");
        }
    }
}
