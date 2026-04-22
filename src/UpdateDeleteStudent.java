public class UpdateDeleteStudent {
    private HashTable hashTable;

    public UpdateDeleteStudent(HashTable hashTable) {
        this.hashTable = hashTable;
    }

    public boolean update(int roll, String name, String dept, double marks) {
        return hashTable.updateStudent(roll, name, dept, marks);
    }

    public boolean delete(int roll) {
        return hashTable.deleteStudent(roll);
    }
}