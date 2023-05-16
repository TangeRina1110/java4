package Asem4.h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ex1 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ivan",86);
        Student student2 = new Student("Grisha",97);
        Student student3 = new Student("Petya", 91);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        Collections.sort(students);
        System.out.println(students);


    }
}
