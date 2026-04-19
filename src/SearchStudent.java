import java.util.Scanner;

public class SearchStudent {
    public static void search(HashTable ht) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        Student s = ht.search(roll);

        if (s != null) {
            System.out.println("Found: " + s.rollNo + " " + s.name + " " + s.department + " " + s.marks);
        } else {
            System.out.println("Student not found!");
        }
    }
}