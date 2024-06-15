
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    List<Student> studentList;
    int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if (hasNext()) {
            return studentList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (hasNext()) {
        }
        studentList.remove(--counter);
    }

}
