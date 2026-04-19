import java.util.*;

// This class handles DATA STRUCTURES only
public class StudentStorage {

    // Hash Table → Fast access using Roll No
    private HashMap<Integer, Student> studentMap;

    // List → Maintain ordered records
    private ArrayList<Student> studentList;

    public StudentStorage() {
        studentMap = new HashMap<>();
        studentList = new ArrayList<>();
    }

    // Add Student (Insert in both DS)
    public void addStudent(Student s) {
        studentMap.put(s.rollNo, s);
        studentList.add(s);
    }

    // Get student using Hash Table (O(1))
    public Student getStudentByRoll(int rollNo) {
        return studentMap.get(rollNo);
    }

    // Get all students using List
    public ArrayList<Student> getAllStudents() {
        return studentList;
    }

    // Remove student from both structures
    public void removeStudent(int rollNo) {
        Student s = studentMap.remove(rollNo);

        if (s != null) {
            studentList.remove(s);
        }
    }

    // Update student inside structures
    public void updateStudent(int rollNo, String name, int age, String course) {
        Student s = studentMap.get(rollNo);

        if (s != null) {
            s.name = name;
            s.age = age;
            s.course = course;
        }
    }

    // Check if exists
    public boolean contains(int rollNo) {
        return studentMap.containsKey(rollNo);
    }
}
