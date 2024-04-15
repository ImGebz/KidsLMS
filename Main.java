

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of Teacher and Student
        Instructor instructor = new Instructor("Mr. Smith");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Test the teacher's methods
        instructor.createClass("Math");
        instructor.addAssignment("Math", "Homework 1");
        instructor.addAssignment("Math", "Homework 2");

        // Test the student's methods
        student1.viewAssignments("Math", List.of("Homework 1", "Homework 2"));
        student1.completeAssignment("Math", "Homework 1");

        instructor.changeGrade("Math", "Homework 1", "Alice", 95);
    }
}
