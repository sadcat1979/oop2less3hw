
import java.util.List;

public class StreamService {

    public List<Stream> getSortedStreamBySize(List<Stream> streams) {
        streams.sort(new StreamComparator());
        return streams;
    }
}
