package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparatorAnotherSyntax {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tung", 35, "HT");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        /*Comparator<Student> ageCom = new Comparator<Student>() {
            @Override
            public int compare(Student o1,
                               Student o2) {
                if (o1.getAge() < o2.getAge()) {
                    return 1;
                } else if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };*/

        /*Comparator<Student> ageCom = (Student o1, Student o2) -> {
            if (o1.getAge() < o2.getAge()) {
                return 1;
            } else if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                return -1;
            }
        };*/

        Comparator<Student> ageCom = (o1, o2) -> o1.getAge() < o2.getAge()
                ? 1
                : -1;

        Collections.sort(lists, ageCom);
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
