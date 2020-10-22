import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CarMakeYears
{

    public static ArrayList<String[]> load() {
        ArrayList<String[]> cars = new ArrayList<>();
        try {
            Scanner inputFile = new Scanner(new File("car-list.txt"));

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
        int oldestPos = 0, newestPos = 0;
        String oldestYear = "3000", newestYear = "0";
        for (int i = 0; i < data.size(); i++){
            if (data.get(i)[0].equals(make) && data.get(i)[2].compareToIgnoreCase(oldestYear) < 0) {
                oldestPos = i;
                oldestYear = data.get(i)[2];
            } else if (data.get(i)[0].equals(make) && data.get(i)[2].equalsIgnoreCase(oldestYear)
                    && data.get(i)[3].compareToIgnoreCase(data.get(oldestPos)[3]) < 0) {
                oldestPos = i;
                oldestYear = data.get(i)[2];
            }
            if (data.get(i)[0].equals(make) && data.get(i)[2].compareToIgnoreCase(newestYear) > 0) {
                newestPos = i;
                newestYear = data.get(i)[2];
            } else if (data.get(i)[0].equals(make) && data.get(i)[2].equalsIgnoreCase(newestYear)
                    && data.get(i)[3].compareToIgnoreCase(data.get(newestPos)[3]) > 0) {
                newestPos = i;
                newestYear = data.get(i)[2];
            }
        }

        System.out.println("Oldest " + make);
        System.out.printf("%15s%25s%5s%18s\n", data.get(oldestPos)[0], data.get(oldestPos)[1],
                data.get(oldestPos)[2], data.get(oldestPos)[3]);
        System.out.println("Newest " + make);
        System.out.printf("%15s%25s%5s%18s\n", data.get(newestPos)[0], data.get(newestPos)[1],
                data.get(newestPos)[2], data.get(newestPos)[3]);
    }
}
