import java.util.List;
import java.util.Map;

public class Student {
    private String name; // Stores the name of the student

    // Constructor to initialize the student's name
    public Student(String name) {
        this.name = name;
    }

    // Method to view assignments for a class
    public void viewAssignments(String className, List<String> assignments) {
        System.out.println("Assignments for class '" + className + "':");
        // Loop through the list of assignments and print each one
        for (String assignment : assignments) {
            System.out.println("- " + assignment);
        }
    }

    // Method to view grades for a class
    public void viewGrades(String className, Map<String, Integer> grades) {
        System.out.println("Grades for class '" + className + "':");
        // Loop through the grades map and print each student's grade
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to indicate completion of an assignment
    public void completeAssignment(String className, String assignmentName) {
        System.out.println("Assignment '" + assignmentName + "' completed by student " + name + " for class '" + className + "'");
    }
}




