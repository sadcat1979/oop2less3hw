
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    List<StudentGroup> studentGroupList = new ArrayList<>();

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }

    public Integer size() {
        return studentGroupList.size();
    }

    @Override
    public String toString() {
        return "Поток на " + studentGroupList.size() + " гр";
    }
}
