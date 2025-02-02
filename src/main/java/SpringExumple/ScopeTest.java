package SpringExumple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println(myDog == yourDog);

        context.close();
    }

}
