import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// StudentScoreAnalyzer

public class exercise2 {
    public static ArrayList<Integer> inputScores() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> scores = new ArrayList<>();

        System.out.print("How many score will you enter?: ");
        int numScores = input.nextInt();

        for (int i = 0; i < numScores; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int score = input.nextInt();

            if (score < 0 || score > 100) {
                System.out.print("Invalid input please try again!!. Enter score: ");
                score = input.nextInt();
            } else {
                scores.add(score);
            }
        }

        return scores;

    }

    public static double calculateAverage(ArrayList<Integer> scores) {
        if (scores.isEmpty()) {
            return 0;
        }

        double average = 0;

        for (int i = 0; i < scores.size(); i++) {
            average += scores.get(i);
        }

        double averageScore = average / scores.size();

        return averageScore;
    }

    public static ArrayList<Integer> getAboveAverageScores(ArrayList<Integer> scores, double averageScore) {
        ArrayList<Integer> aboveAverage = new ArrayList<>();

        for (int score : scores) {
            if (score > averageScore) {
                aboveAverage.add(score);
            }
        }

        return aboveAverage;
    }

    public static void applyCurve(ArrayList<Integer> scores, int curvePoints) {

        for (int i = 0; i < scores.size(); i++) {

            int curvedScore = scores.get(i) + curvePoints;

            if (curvedScore > 100) {
                curvedScore = 100;
            }

            scores.set(i, curvedScore);
        }

        System.out.print(scores);
    }

    public static void displayStatistics(ArrayList<Integer> scores) {
        System.out.println("Original statistics: ");

        System.out.println("Count: " + scores.size());

        System.out.println("Average: " + calculateAverage(scores));

        int highest = scores.get(0);
        int lowest = scores.get(0);

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > highest) {
                highest = scores.get(i);
            } else if (scores.get(i) < lowest) {
                lowest = scores.get(i);
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        Collections.sort(scores);

        int size = scores.size();
        double median;

        if (scores.size() % 2 == 0) {
            int middle1 = scores.get(size / 2 - 1);
            int middle2 = scores.get(size / 2);

            median = (middle1 + middle2) / 2.0;

        } else {

            median = scores.get(size / 2);
        }

        System.out.print("Median: " + median);

    }

    public static void removeFailedScores(ArrayList<Integer> scores) {

        for (int i = scores.size() - 1; i >= 0; i--) {
            
            if (scores.get(i) < 60) {
                scores.remove(i);
            }

        }

        System.out.print(scores);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> scoreList = inputScores();

        displayStatistics(scoreList);
        input.nextLine();

        double avg = calculateAverage(scoreList);

        ArrayList<Integer> average = getAboveAverageScores(scoreList, avg);

        System.out.println("Show scores above average: " + average);
        input.nextLine(); 
      

        System.out.println("Plese enter curve points: ");
        int curvePoints = input.nextInt();

        System.out.println("After curve: ");
        applyCurve(scoreList, curvePoints);
        input.nextLine();

        System.out.println("After removing failed scores: ");
        removeFailedScores(scoreList);

    }
}
