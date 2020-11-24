import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Set<String> words = new LinkedHashSet<>();
        System.out.println("Enter ten words");

        while (keyboard.hasNextLine())
            words.add(keyboard.nextLine());

        TreeMap<Integer, String> data = HashFunction.getAllHashes(words);

        data.forEach((key, value) -> {
            System.out.println("Hash: " + key + " Word: " + value);
        });
    }
}
