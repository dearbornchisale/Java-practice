import java.util.ArrayList;
import java.util.Collections;

public class StudentManager {
      private ArrayList<String> students;
    
    public StudentManager() {
        students = new ArrayList<>();
    }
    
    /**
     * Adds a student name to the list.
     * Throws IllegalArgumentException if name is null or empty/blank.
     */
    public void addStudent(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be null or empty");
        }
        students.add(name.trim());
    }

    
    /**
     * Removes a student by name (case-insensitive).
     * Returns true if removed, false if not found.
     */
    public boolean removeStudent(String name) {
        if (name == null) return false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equalsIgnoreCase(name.trim())) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Returns a sorted list of all student names (alphabetical, case-insensitive order).
     * Does not modify the original list.
     */
    public ArrayList<String> getSortedStudents() {
        ArrayList<String> sorted = new ArrayList<>(students);
        Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        return sorted;
    }
    
    /**
     * Searches for students whose names contain the keyword (case-insensitive).
     * Returns a new ArrayList of matching names.
     */
    public ArrayList<String> searchStudents(String keyword) {
        ArrayList<String> results = new ArrayList<>();
        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }
        String lowerKeyword = keyword.trim().toLowerCase();
        for (String s : students) {
            if (s.toLowerCase().contains(lowerKeyword)) {
                results.add(s);
            }
        }
        return results;
    }
    
    /**
     * Returns the current list of students (direct reference - for testing only).
     */
    public ArrayList<String> getStudents() {
        return students;
    }
}
