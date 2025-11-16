package inheritance2;

class Student extends Person {
          protected int hardwork;
          protected int taskcomplete;
          public Student(String name, int id, int hardwork, int taskcomplete) {
                    super(name, id);
                    this.hardwork = hardwork;
                    this.taskcomplete = taskcomplete;
          }
          
}
