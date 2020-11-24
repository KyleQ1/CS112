import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarMake
{

    public static ArrayList<String[]> load() {
        ArrayList<String[]> cars = new ArrayList<>();
        try {
            Scanner inputFile = new Scanner(new File("cars.txt"));

            // Skip top line
            inputFile.nextLine();
            while (inputFile.hasNextLine()) {
                // get the entire line
                String lineJustFetched = inputFile.nextLine();
                if (lineJustFetched == null) {
                    break;
                } else {
                    // parse by entire line by tabs
                    String[] wordsArray = lineJustFetched.split("\t");
                    // add as an array
                    cars.add(wordsArray);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return cars;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String[]> data = load();

        System.out.println("What car make are you looking for?");
        String make = keyboard.nextLine();

        Sort.sort(data);
        for (String[] datum : data) {
            if (datum[0].equals(make)) {
                System.out.printf("%15s%25s%5s\n", datum[0], datum[1], datum[2]);
            }
        }
    }
}
