import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OldestCarByFile
{

    public static ArrayList<String[]> load(String file) {
        ArrayList<String[]> cars = new ArrayList<>();
        try {
            Scanner inputFile = new Scanner(new File(file));

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

        System.out.println("Enter filename");
        ArrayList<String[]> data = load(keyboard.nextLine());

        Sort.sort(data);
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i)[0].equalsIgnoreCase(data.get(i + 1)[0])
                    && data.get(i)[2].compareTo(data.get(i + 1)[2]) > 0) {
                data.remove(i);
                i--;
            } else if (data.get(i)[0].equalsIgnoreCase(data.get(i + 1)[0])
                    && data.get(i)[2].compareTo(data.get(i + 1)[2]) < 0) {
                data.remove(i + 1);
                i--;
            } else if (data.get(i)[0].equalsIgnoreCase(data.get(i + 1)[0])
                    && data.get(i)[2].equalsIgnoreCase(data.get(i + 1)[2])) {
                if (data.get(i)[3].compareToIgnoreCase(data.get(i+1)[3]) > 0) {
                    data.remove(i);
                }
                else {
                    data.remove(i + 1);
                }
                i--;
            }
        }

        System.out.println("Oldest cars by make");
        for (String[] datum : data) {
            System.out.printf("%15s%25s%5s%18s\n", datum[0], datum[1], datum[2], datum[3]);
        }
        System.out.println(data.size() + " result(s)");
    }
}
