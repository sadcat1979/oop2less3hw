
public class Student implements Comparable<Student> {

    int studentId;
    String firstName;
    String secondName;
    String lastName;

    public Student(int studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Студент [studentId=" + studentId + ", firstName=" + firstName + ", secondName=" + secondName
                + ", lastName=" + lastName + "]";
    }

    @Override
    public int compareTo(Student o) {
        return studentId - o.studentId;
    }

}
