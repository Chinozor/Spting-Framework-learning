package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        School school = context.getBean("school", School.class);
        school.addStudents();
        try {
            List<Student> students = school.getStudents();
        } catch (Exception e) {
            System.out.println("было поймано исключение");
        }

        context.close();

    }
}
