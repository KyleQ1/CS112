import java.util.Scanner;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How should the data be stored?");
        System.out.println("1. Price");
        System.out.println("2. Name");
        int option = keyboard.nextInt();

        TreeSet<Stock> data;
        if (option == 1) {
            // sort by price
            data = new TreeSet<>(new PriceComparator());
        } else if (option == 2) {
            // sort by name
            data = new TreeSet<>(new NameComparator());
        } else {
            System.out.println("Unrecognized Option");
            data = new TreeSet<>();
        }

        // load the data
        Stock.load(data); // sort based on the comparator

        // show the data
        data.forEach(System.out::println);
    }
}
