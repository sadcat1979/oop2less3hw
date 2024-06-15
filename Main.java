
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(2, "Егор", "Артемович", "Костыленко");
        Student student2 = new Student(4, "Андрей", "Евгеньевич", "Баринов");
        Student student3 = new Student(3, "Александр", "Алексеевич", "Фурманов");
        Student student4 = new Student(1, "Игорь", "Егорович", "Урнов");
        Student student5 = new Student(6, "Илья", "Юрьевич", "Горнин");
        Student student6 = new Student(5, "Леонид", "Алексеевич", "Шеулин");
        StudentGroup studentGroup1 = new StudentGroup(List.of(student1, student2, student3, student4));
        StudentGroup studentGroup2 = new StudentGroup(List.of(student5, student6));
        StudentGroup studentGroup3 = new StudentGroup(List.of(student1, student2, student3));
        StudentGroup studentGroup4 = new StudentGroup(List.of(student5, student6));

        Stream stream1 = new Stream(List.of(studentGroup1, studentGroup2, studentGroup3));
        Stream stream2 = new Stream(List.of(studentGroup4));

        StudentGroupService service = new StudentGroupService(studentGroup1);
        service.soutStudentGroup();
        //Удалить Фурманова по ФИО
        //service.removeStudentFIO("Александр", "Алексеевич", "Фурманов");

        System.out.println("Сортировка группы1 по id:");
        for (Student student : service.getSortedStudentGroupBuId()) {
            System.out.println(student);
        }

        System.out.println("Сортировка группы1 по ФИО:");
        for (Student student : service.getSortedStudentGroupBuFIO()) {
            System.out.println(student);
        }

        List<Stream> streams = new ArrayList<>(List.of(stream1, stream2));
        System.out.println("До сортировки " + streams);
        System.out.println("После сортировки " + new StreamService().getSortedStreamBySize(streams));
    }

}
