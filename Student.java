import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentFilterSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85.5));
        students.add(new Student("Bob", 72.0));
        students.add(new Student("Charlie", 90.0));
        students.add(new Student("David", 65.0));
        students.add(new Student("Eve", 78.0));

        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.marks > 75.0) {
                filteredStudents.add(student);
            }
        }

        Collections.sort(filteredStudents, Comparator.comparingDouble(student -> student.marks));
        System.out.println("Students scoring above 75% sorted by marks:");
        for (Student student : filteredStudents) {
            System.out.println(student.name + " - Marks: " + student.marks);
        }
    }
}
