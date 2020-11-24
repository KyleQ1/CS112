import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Car
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
        ArrayList<String[]> data = load();

        Sort.sort(data);
        for (String[] datum : data) {
            System.out.printf("%15s%25s%5s\n", datum[0], datum[1], datum[2]);
        }
    }
}
