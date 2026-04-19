public class MainTest {
    public static void main(String[] args) {

        // Create storage object
        StudentStorage storage = new StudentStorage();

        // Add students
        storage.addStudent(new Student(101, "Atharva", 20, "IT"));
        storage.addStudent(new Student(102, "Sidhart", 21, "CS"));

        // Display all students
        System.out.println("=== All Students ===");
        for (Student s : storage.getAllStudents()) {
            System.out.println(s.rollNo + " " + s.name + " " + s.course);
        }

        // Search student
        System.out.println("\n=== Search Student (101) ===");
        Student found = storage.getStudentByRoll(101);
        if (found != null) {
            System.out.println(found.name);
        }

        // Update student
        storage.updateStudent(101, "Atharva Parbat", 20, "AI");

        System.out.println("\n=== After Update ===");
        System.out.println(storage.getStudentByRoll(101).name);

        // Delete student
        storage.removeStudent(102);

        System.out.println("\n=== After Deletion ===");
        for (Student s : storage.getAllStudents()) {
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}