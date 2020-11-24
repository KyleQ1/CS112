import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats
{
    private String filename;

    FileStats(String filename) {
        this.filename = filename;
    }

    int getNumMatchingWords(String key) throws FileNotFoundException {
        Scanner file = new Scanner(new File(filename));

        int numMatchingWords = 0;
        while (file.hasNext()) {
            String line = file.nextLine().toLowerCase();
            if (line.contains(key.toLowerCase())) {
                numMatchingWords++;
            }
        }

        return numMatchingWords;
    }

    int getNumLines() throws FileNotFoundException {
        Scanner file = new Scanner(new File(filename));

        int numLines = 0;
        while (file.hasNext()) {
            file.nextLine();
            numLines++;
        }

        return numLines;
    }
}
