
import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    List<StudentGroup> studentGroupList;
    int counter;

    public StreamIterator(Stream stream) {
        this.studentGroupList = stream.studentGroupList;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return studentGroupList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if (hasNext()) {
        }
        studentGroupList.remove(--counter);
    }

}
