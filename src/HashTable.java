public class HashTable {
    static final int SIZE = 100;
    Student[] table = new Student[SIZE];

    int hashFunction(int rollNo) {
        return rollNo % SIZE;
    }

    public void insert(Student s) {
        int index = hashFunction(s.rollNo);

        while (table[index] != null) {
            index = (index + 1) % SIZE;
        }

        table[index] = s;
    }

    public Student search(int rollNo) {
        int index = hashFunction(rollNo);
        int start = index;

        while (table[index] != null) {
            if (table[index].rollNo == rollNo) {
                return table[index];
            }
            index = (index + 1) % SIZE;

            if (index == start) break;
        }
        return null;
    }

    public void delete(int rollNo) {
        int index = hashFunction(rollNo);

        while (table[index] != null) {
            if (table[index].rollNo == rollNo) {
                table[index] = null;
                return;
            }
            index = (index + 1) % SIZE;
        }
    }

    public Student[] getAll() {
        return table;
    }
}
