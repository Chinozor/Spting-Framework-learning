package aop;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class School {

    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student student1 = new Student("Yurii Aleksin", 23,8);
        Student student2 = new Student("Zaur Tregulov", 33,10);
        Student student3 = new Student("Nikita Sivokhin", 24,4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("information from method getStudents:");
        students.get(3);
        System.out.println(students);
        return students;
    }

}
