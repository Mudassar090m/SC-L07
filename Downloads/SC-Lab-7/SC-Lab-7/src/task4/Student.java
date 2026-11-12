package task4;

/** Natural ordering (built into the class): ascending by rollNo. */
public class Student implements Comparable<Student> {

    private final int rollNo;
    private final double cgpa;

    public Student(int rollNo, double cgpa) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", cgpa=" + cgpa + "}";
    }
}
