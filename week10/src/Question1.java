import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Set<String> data = new TreeSet<>(new NameComparator());
        while (keyboard.hasNextLine()) {
            System.out.println("Enter a line of text");
            String line = keyboard.nextLine();
            if (!line.toLowerCase().equals("exit"))
            data.add(line);
        }

       data.forEach(System.out::println);
    }
}
