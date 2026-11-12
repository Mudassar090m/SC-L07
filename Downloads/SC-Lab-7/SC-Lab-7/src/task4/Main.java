package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Lab Task 4: Comparable vs Comparator ===");

        List<Student> students = new ArrayList<>();
        students.add(new Student(102, 3.5));
        students.add(new Student(103, 3.9));
        students.add(new Student(101, 3.2));

        System.out.println("\nOriginal order:");
        print(students);

        // Natural order: uses Student.compareTo (rollNo ascending)
        Collections.sort(students);
        System.out.println("\nSorted by rollNo (Comparable, ascending):");
        print(students);

        // External order: uses CgpaComparator (cgpa descending)
        students.sort(new CgpaComparator());
        System.out.println("\nSorted by cgpa (Comparator, descending):");
        print(students);
    }

    private static void print(List<Student> students) {
        for (Student s : students) {
            System.out.println("  " + s);
        }
    }
}
