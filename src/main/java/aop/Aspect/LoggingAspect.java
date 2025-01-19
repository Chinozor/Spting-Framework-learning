package aop.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* aop.SchoolLibrary.*(..))")
//    private void allMethodsFromSchoolLibrary(){}
//
//    @Pointcut("execution(public void aop.SchoolLibrary.returnMagazine())")
//    private void returnMagazineFromSchoolLibrary(){}
//
//    @Pointcut("allMethodsFromSchoolLibrary() && !returnMagazineFromSchoolLibrary()")
//    private void allMethodsExceptReturnMagazineFromSchoolLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromSchoolLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log # 10");
//    }


//    @Pointcut("execution(* aop.SchoolLibrary.get*())")
//    private void allGetMethodsFromSchoolLibrary(){}
//
//    @Pointcut("execution(* aop.SchoolLibrary.return*())")
//    private void allReturnMethodsFromSchoolLibrary(){}
//
//    @Pointcut("allGetMethodsFromSchoolLibrary() || allReturnMethodsFromSchoolLibrary()")
//    private void allGetAndReturnsMethodFromSchoolLibrary(){}
//
//    @Before("allGetMethodsFromSchoolLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromSchoolLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("allGetAndReturnsMethodFromSchoolLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }


    @Before("aop.Aspect.MyPointcuts.allAddMethods()")
    public void beforeAddBookAdvice(JoinPoint joinPoint){

        joinPoint.getSignature();

        System.out.println("MethodSignature = " + joinPoint.getSignature());


        System.out.println("beforeGetBookAdvice: логирование попытки попытка получить книгу или журнал");
        System.out.println("-------------------------------------------------------------------------");

    }




}
