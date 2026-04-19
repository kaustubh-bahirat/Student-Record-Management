public class HashTable {
   static final int SIZE = 100;
   Student[] table = new Student[100];

   public HashTable() {
   }

   int hashFunction(int var1) {
      return var1 % 100;
   }

   public void insert(Student var1) {
      int var2;
      for(var2 = this.hashFunction(var1.rollNo); this.table[var2] != null; var2 = (var2 + 1) % 100) {
      }

      this.table[var2] = var1;
   }

   public Student search(int var1) {
      int var2 = this.hashFunction(var1);
      int var3 = var2;

      while(this.table[var2] != null) {
         if (this.table[var2].rollNo == var1) {
            return this.table[var2];
         }

         var2 = (var2 + 1) % 100;
         if (var2 == var3) {
            break;
         }
      }

      return null;
   }

   public void delete(int var1) {
      for(int var2 = this.hashFunction(var1); this.table[var2] != null; var2 = (var2 + 1) % 100) {
         if (this.table[var2].rollNo == var1) {
            this.table[var2] = null;
            return;
         }
      }

   }

   public Student[] getAll() {
      return this.table;
   }
}
