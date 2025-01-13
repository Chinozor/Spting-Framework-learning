package SpringExumple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Cat cat = context.getBean("myPet", Cat.class);
        Cat myCat = context.getBean("myPet", Cat.class);

        System.out.println(cat == myCat);
        context.close();
    }
}
