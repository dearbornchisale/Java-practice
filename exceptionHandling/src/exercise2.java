import java.util.ArrayList;
import java.util.Scanner;

public class exercise2 {
    public static Student findStudent(ArrayList<Student> students, String name) throws StudentNotFoundException {

        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }

        throw new StudentNotFoundException("Error: Student " + name + " not found! :(");
    }

    public static double getClassAverage(ArrayList<Student> students) throws EmptyClassroomException {
        if (students.isEmpty()) {
            throw new EmptyClassroomException("No students in the classroom");
        }

        double totalAverage = 0;

        for (Student s : students) {
            totalAverage += s.calculateAverage();
        }

        return totalAverage / students.size();
    }

    public static void addStudentGrade(ArrayList<Student> students, String studentName, int grade)
            throws StudentNotFoundException, InvalidGradeException {
        Student s = findStudent(students, studentName);

        s.addGrade(grade);
    }

    public static void displayAllStudents(ArrayList<Student> students) {

        System.out.println("==== Display All Students ====");

        if (students == null || students.isEmpty()) {
            throw new EmptyClassroomException("Students list is empty");
        }

        for (Student s : students) {
            System.out.println("- "+ s);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Student Grade Manager ");

        ArrayList<Student> students = new ArrayList<>();

        try {
            boolean option = true;
            while (option) {
                System.out.print("Add Student: ");
                String name = input.next();

                System.out.print("Enter student grade/s for " + name + " :");
                int grade = input.nextInt();

                Student s = new Student(name);
                students.add(s);

                addStudentGrade(students, name, grade);

                System.out.print("Do you want to add another student (yes/no)?: ");
                String ans = input.next();

                if (ans.equalsIgnoreCase("no")) {
                    option = false;
                }
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        try {
            System.out.println("Calculate class average: " + getClassAverage(students));
        } catch (Exception e) {
            System.out.print(e);

        }

        try {
            System.out.print("Search for student name: ");
            String name2 = input.next();

            findStudent(students, name2);
        } catch (Exception e) {
            System.out.print(e);
        }
        try{
            displayAllStudents(students);
        }catch(Exception e){
            System.out.print(e);
        }
       
    }
}
                                                                                                                                                    