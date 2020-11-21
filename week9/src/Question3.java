import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public static ArrayList<String> load() {
        ArrayList<String> users = new ArrayList<>();

        try {
            Scanner inputFile = new Scanner(new File("user-database.txt"));
            // Skip top line
            inputFile.nextLine();

            while (inputFile.hasNext()) {
                // get the entire line
                String lineJustFetched  = inputFile.nextLine();
                // parse entire line by tabs
                String [] wordsArray = lineJustFetched.split("\t");
                // add to arraylist formatted
                users.add(String.format("%20s%20s", wordsArray[1], wordsArray[0]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return users;
    }

    public static ArrayList<String> insertionSort(ArrayList<String> data, int start, int end) {
        for (int index = 1; index < data.size(); index++) {
            String unsortedValue = data.get(index);
            int scan = index;
            while (scan > 0 && data.get(scan - 1).compareToIgnoreCase(unsortedValue) > 0) {
                data.set(scan, data.get(scan - 1));
                scan--;
            }
            data.set(scan, unsortedValue);
        }

        ArrayList<String> subData = new ArrayList<>();
        for (int i = start; i < end; i++) {
            subData.add(data.get(i));
        }

        return subData;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a starting point and ending point");
        int start = keyboard.nextInt();
        int end = keyboard.nextInt();

        ArrayList<String> users = load();

        users = insertionSort(users, start, end);

        for (String user : users) {
            System.out.println(user);
        }
    }
}
