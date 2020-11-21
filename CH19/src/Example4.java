import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example4 {
    public static void main(String[] args) {
        try {
            long numWords = Files.lines(Path.of("buzzwords.txt"))
            .filter(x -> x.length() > 10)
            .sorted()
            .distinct()
            .peek(System.out::println)
            .count();

            System.out.println("Num words that went through the stream: " + numWords);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
