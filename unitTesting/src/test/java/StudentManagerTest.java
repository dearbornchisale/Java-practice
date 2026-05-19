import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentManagerTest {
    @Test
    @DisplayName("Should add student")
    public void testAddStudent() {
        StudentManager manager = new StudentManager();

        manager.addStudent("John");

        assertTrue(manager.getStudents().contains("John"), "Student should be added to list");
    }

    @Test
    @DisplayName("Should throw an exception if name is null/blank")
    public void testAddStudentNull() {
        StudentManager manager = new StudentManager();

        assertThrows(IllegalArgumentException.class, () -> { 
            manager.addStudent(null);

        });
    }


    @Test
    @DisplayName("Should throw an exception if name is null/blank")
    public void testAddStudentBlank() {
        StudentManager manager = new StudentManager();

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addStudent("");
        });
    }

    @Test
    @DisplayName("Should return true for after removing student name")
    public void testRemoveNull(){
        StudentManager manager = new StudentManager();
        
        assertFalse( manager.removeStudent(null));
    }

    @Test
    @DisplayName("Should remove existing student and return true")
    public void testRemoveExistingStudents(){
        StudentManager manager = new StudentManager();

        manager.addStudent("John");

        boolean result = manager.removeStudent("John");

        assertTrue(result);
        assertFalse(manager.getStudents().contains("John"));
    }

    @Test
    @DisplayName("Should remove student ignoring case and spaces")
    public void testRemoveCaseSensitive(){
        StudentManager manager = new StudentManager();

        manager.addStudent("John");

        boolean result = manager.removeStudent(" john ");

        assertTrue(result);
        assertFalse(manager.getStudents().contains("John"));

    }

    @Test
    @DisplayName("Should return false when students doesn't exist")
    public void testRemoveNonExisting(){
        StudentManager manager = new StudentManager();

        manager.addStudent("Dearborn");

        assertFalse(manager.removeStudent("John"));
    }

    @Test
    @DisplayName("Should verify sort order")
    public void testListSortOrder(){
        StudentManager manager = new StudentManager();

        List<String> expected = new ArrayList <> (manager.getStudents());
        expected.sort(String::compareToIgnoreCase);

        assertEquals(expected, manager.getStudents());
    }

    @Test
    @DisplayName("Should not chnage orginal list")
    public void testListNotChanged(){
        StudentManager manager = new StudentManager();

        manager.addStudent("Mark");
        manager.addStudent("Zoe");

        List<String> original = new ArrayList<>(manager.getStudents());

        manager.removeStudent("NotRealStudent");

        assertEquals(original, manager.getStudents());
    } 

}
