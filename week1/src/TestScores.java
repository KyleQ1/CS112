public class TestScores
{
    private String name;
    private double totalScore;
    private int numScores;

    TestScores(String name) {
        this.name = name;
    }

    void addTestScore(double earned) {
        numScores++;
        totalScore+=earned;
    }

    int getNumTestsTaken() { return numScores; }

    double getAverage() { return totalScore / numScores; }
}
