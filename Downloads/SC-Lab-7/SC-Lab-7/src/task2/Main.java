package task2;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Lab Task 2: Generic DataBox<T> ===");

        DataBox<String> studentName = new DataBox<>("Hanif Ullah");
        DataBox<Integer> studentId = new DataBox<>(2023);

        // No cast needed: the compiler already knows the types.
        String name = studentName.getValue();
        int id = studentId.getValue();

        System.out.println("Student name: " + name);
        System.out.println("Student ID  : " + id);

        // ---- Compile-time safety demonstration ----
        // Remove the // from the next line and NetBeans shows a red error immediately.
        // The program will not compile, so the mistake can never reach runtime.
        //
        // DataBox<Integer> wrongBox = new DataBox<>("Hanif Ullah");
        //
        // Likewise, this is rejected because getValue() returns an Integer:
        // String wrongType = studentId.getValue();

        System.out.println("A String cannot be stored in DataBox<Integer>: the compiler blocks it.");
    }
}
