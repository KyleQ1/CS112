import java.util.Map;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter ticker");
        String ticker = keyboard.nextLine();

        Map<String, Stock> data = Stock.loadToMap();

        // no loop, instant lookup
        // hash maps are epic
        System.out.println(data.get(ticker.toUpperCase()));
    }
}
