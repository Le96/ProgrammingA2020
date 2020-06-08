package lec05;

public class UniversityTest {
    public static void main(String[] args) {
        University waseda = new University();
        Student[] s = new Student[] { new Student("田中", 100), new Student("山本", 50), new Student("森", 68), };
        waseda.students = s;
        waseda.list();
    }

}

class University {
    Student[] students;

    void list() {
        for (Student student : this.students) {
            System.out.println(student.getName() + "は卒業できる: " + student.isOK());
        }
    }
}
