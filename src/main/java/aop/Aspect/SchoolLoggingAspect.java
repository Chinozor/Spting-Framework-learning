package aop.Aspect;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class SchoolLoggingAspect {

//    @Before("execution(* getStudents())")
//    private void beforeGetStudentsGetLoggingAdvice(){
//        System.out.println("beforeGetStudentsGetLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    private void afterReturningGetStudentsGetLoggingAdvice(List<Student> students){
//
//        Student firstStudent = students.get(0);
//        String surnameStudent = firstStudent.getNameSurname();
//        surnameStudent = "Mr." + surnameStudent;
//        firstStudent.setNameSurname(surnameStudent);
//
//        System.out.println("afterReturningGetStudentsGetLoggingAdvice: логируем получение списка студентов после работы метода getStudents");
//    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    private void afterThrowingingGetStudentsGetLoggingAdvice(Throwable exception){
        System.out.println("Логируем выбор исключения " + exception);
    }
}
