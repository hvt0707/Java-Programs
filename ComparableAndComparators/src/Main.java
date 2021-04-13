import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Harsh", 89));
        studentList.add(new Student("Rohan", 87));
        studentList.add(new Student("Harsh", 88));
        studentList.add(new Student("Samyak", 85));
        studentList.add(new Student("Harshad", 92));
//        Collections.sort(studentList, new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.name.equals(o2.name)){
//                return o1.marks - o2.marks;
//            }
//                return o1.name.compareTo(o2.name);
//            }
//        });


//        Collections.sort(studentList, (o1,o2) -> {
//           if(o1.name.equals(o2.name)){
//               return o1.marks- o2.marks;
//           }
//           return o1.name.compareTo(o2.name);
//        });

        Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());

//        studentList.forEach(System.out::println);
        for(Student student: studentList) {
            System.out.println(student);
        }
    }
}

//class SortByNameThenMarks implements Comparator<Student>{
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        if(o1.name.equals(o2.name)){
//            return o1.marks - o2.marks;
//        }
//        return o1.name.compareTo(o2.name);
//    }
//}
