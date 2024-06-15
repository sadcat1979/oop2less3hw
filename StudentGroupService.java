
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getSortedStudentGroupBuId() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        Collections.sort(studentList);
        return studentList;
    }

    public void removeStudentFIO(String firstName, String secondName, String lastName) {
        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
        while (iterator.hasNext()) {
            Student studentItem = iterator.next();
            if (studentItem.firstName.equals(firstName)
                    && studentItem.secondName.equals(secondName)
                    && studentItem.lastName.equals(lastName)) {
                iterator.remove();
            }

        }
    }

    public void soutStudentGroup() {
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }

    public List<Student> getSortedStudentGroupBuFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList);
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
