public class SearchStudent {
    private HashTable hashTable;

    public SearchStudent(HashTable hashTable) {
        this.hashTable = hashTable;
    }

    public Student search(int roll) {
        return hashTable.searchStudent(roll);
    }
}
