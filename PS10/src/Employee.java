import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Employee {

    private String id, firstName, lastName, email;

    public Employee(String[] tokens) {
        id = tokens[0];
        firstName = tokens[1];
        lastName = tokens[2];
        email = tokens[3];
    }

    public static Map<String, Employee> load() {
        Map<String, Employee> data = new HashMap<>();
        try {
            Scanner inputFile = new Scanner(new File("employees.txt"));
            inputFile.nextLine();
            while (inputFile.hasNext()) {
                Employee e = new Employee(inputFile.nextLine().split("\t"));
                // associate the id with the employee object
                // 18-1078355 -> {18-1078355, Binnie, Barfoot, bbarfoot46@biblegateway.com}
                data.put(e.id, e);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return data;
    }

    public String toString() {
        return id + " -> " + firstName + " " + lastName + " " + email;
    }
}
