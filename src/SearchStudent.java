import java.util.Scanner;

public class SearchStudent {

    public static void search(HashTable ht) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("\n========== SEARCH STUDENT ==========");
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        
        Student s = ht.search(roll);


        System.out.println("\n----------------------------------");

        if (s != null) {
            System.out.println("        STUDENT FOUND");
            System.out.println("----------------------------------");
            System.out.println("Roll No     : " + s.rollNo);
            System.out.println("Name        : " + s.name);
            System.out.println("Department  : " + s.department);
            System.out.println("Marks       : " + s.marks);
        } else {
            System.out.println("Student not found in records.");
        }

        System.out.println("----------------------------------");
    }
}
