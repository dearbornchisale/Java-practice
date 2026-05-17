package exceptionHandling.src;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(int grade) throws InvalidGradeException {

        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade cannot be between 0 and 100");
        }
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        double average = 0;

        for (int i : grades) {
            average += i;
        }

        return average / grades.size();
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\n Grades: " + grades;
    }
}
