import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Instructor {
    private String name; // Stores the name of the instructor
    private Map<String, List<String>> classAssignments; // Maps class names to their respective assignments
    private Map<String, Map<String, Integer>> assignmentGrades; // Maps assignments to the grades of students

    // Constructor to initialize the instructors name and data structures
    public Instructor(String name) {
        this.name = name;
        this.classAssignments = new HashMap<>();
        this.assignmentGrades = new HashMap<>();
    }

    // Method to create a new class
    public void createClass(String className) {
        // Check if the class already exists
        if (!classAssignments.containsKey(className)) {
            // If not, add the class to the map and initialize assignments and grades maps for it
            classAssignments.put(className, new ArrayList<>());
            assignmentGrades.put(className, new HashMap<>());
            System.out.println("Class '" + className + "' created successfully by teacher " + name);
        } else {
            // If the class already exists, inform the instructor
            System.out.println("Class '" + className + "' already exists");
        }
    }

    // Method to delete a class
    public void deleteClass(String className) {
        // Check if the class exists
        if (classAssignments.containsKey(className)) {
            // If it does, remove it from both maps
            classAssignments.remove(className);
            assignmentGrades.remove(className);
            System.out.println("Class '" + className + "' deleted successfully by teacher " + name);
        } else {
            // If not, inform the instructor
            System.out.println("Class '" + className + "' not found");
        }
    }

    // Method to add an assignment to a class
    public void addAssignment(String className, String assignmentName) {
        // Check if the class exists
        if (classAssignments.containsKey(className)) {
            // If it does, add the assignment to the list of assignments for that class
            List<String> assignments = classAssignments.get(className);
            assignments.add(assignmentName);
            System.out.println("Assignment '" + assignmentName + "' added to class '" + className + "' by teacher " + name);
        } else {
            // If not, inform the instructor
            System.out.println("Class '" + className + "' not found");
        }
    }

    // Method to remove an assignment from a class
    public void removeAssignment(String className, String assignmentName) {
        // Check if the class exists
        if (classAssignments.containsKey(className)) {
            // If it does, get the list of assignments for that class
            List<String> assignments = classAssignments.get(className);
            // Check if the assignment exists in the list
            if (assignments.contains(assignmentName)) {
                // If it does, remove it
                assignments.remove(assignmentName);
                System.out.println("Assignment '" + assignmentName + "' removed from class '" + className + "' by teacher " + name);
            } else {
                // If not, inform the instructor
                System.out.println("Assignment '" + assignmentName + "' not found in class '" + className + "'");
            }
        } else {
            // If the class does not exist, inform the instructor
            System.out.println("Class '" + className + "' not found");
        }
    }

    // Method to change the grade of a student for an assignment in a class
    public void changeGrade(String className, String assignmentName, String studentName, int newGrade) {
        // Check if the class exists
        if (classAssignments.containsKey(className)) {
            // If it does, get the grades map for that class
            Map<String, Integer> grades = assignmentGrades.get(className);
            // Check if the student exists in the class
            if (grades.containsKey(studentName)) {
                // If they do, update their grade for the assignment
                grades.put(studentName, newGrade);
                System.out.println("Grade for assignment '" + assignmentName + "' changed to " + newGrade + " for student '" + studentName + "'");
            } else {
                // If the student does not exist, inform the instructor
                System.out.println("Student '" + studentName + "' not found in class '" + className + "'");
            }
        } else {
            // If the class does not exist, inform the instructor
            System.out.println("Class '" + className + "' not found");
        }
    }
}
