import java.util.Scanner;

public class TestScoresDemo
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter name");
        String name = keyboard.nextLine();
        TestScores t = new TestScores(name);

        float testScore = 0f;
        int numScores = 1;
        while(testScore >= 0) {
            System.out.println("Enter score " + numScores++ + " or a negative number to exit");
            testScore = keyboard.nextFloat();
            if (testScore >= 0f) {
                t.addTestScore(testScore);
            }
        }

        System.out.println("-- " + name + " --");
        System.out.println("Num tests taken: " + t.getNumTestsTaken());
        System.out.print("Average: ");
        System.out.printf("%.1f%n", t.getAverage());
    }
}
