
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String s1 = o1.lastName + o1.firstName + o1.secondName;
        String s2 = o2.lastName + o2.firstName + o2.secondName;
        int len;
        if (s1.length() < s2.length()) {
            len = s1.length();
        } else {
            len = s2.length();
        }
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            }
            if (s2.charAt(i) > s1.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}
