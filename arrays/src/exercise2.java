import java.util.Scanner;

public class exercise2 {

    public static double[] inputGrade() {
        Scanner input = new Scanner(System.in);

        System.out.print("How many grades do you want to enter: ");
        int numGrades = input.nextInt();

        double[] grades = new double[numGrades];

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter a grade: " + (i +1) + ": ");
            double mark = input.nextDouble();

            grades[i] = mark;

        }

        return grades;

    }

    public static double calculateAverage(double[] grades) {
        
        double averageMark = 0;
        for (int i = 0; i < grades.length; i++) {
            averageMark += grades[i];
        }

        return averageMark / grades.length;
    }

    public static double findHighest(double[] grades) {
        double max = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }

        return max;
    }

    public static double findLowest(double[] grades) {
        double min = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }

        return min;
    }

    public static double countAboveAverage(double[] grades, double averageMark) {
        double aboveAverage = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > averageMark) {
                aboveAverage++;
            }
        }

        return aboveAverage;

    }

    public static void displayGradeDistribution(double[] grades) {
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        for (double grade : grades) {

            if (grade > 90 && grade <= 100) {
                gradeA++;
            } else if (grade > 80) {
                gradeB++;
            } else if (grade > 70) {
                gradeC++;
            } else if (grade > 60) {
                gradeD++;
            } else {
                gradeF++;
            }
        }
        System.out.println("Grade Distribution: ");
        System.out.println("A (90-100): " + gradeA + " student(s)");
        System.out.println("B (80-90): " + gradeB + " student(s)");
        System.out.println("C (70-80): " + gradeC + " student(s)");
        System.out.println("D (60-70): " + gradeD + " student(s)");
        System.out.println("F (below 60): " + gradeF + " student(s)");

    }

    public static void main(String[] args) {

        double[] grades = inputGrade();

        System.out.println("Result: ");

        double average = calculateAverage(grades);

        System.out.println("Average: " + average);
        System.out.println("Highest: " + findHighest(grades));
        System.out.println("Lowest: "+ findLowest(grades));
        System.out.println("Students above average: " + countAboveAverage(grades, average ));

        displayGradeDistribution(grades);
    }
}
