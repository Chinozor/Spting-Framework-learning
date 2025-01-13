package SpringExumple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext2.xml");

        Person person = context.getBean("personBean", Person.class);

        person.callYourPet();

        System.out.println(person);

        /*Cat  cat = context.getBean("catBean", Cat.class);

        cat.say();*/

        context.close();
    }
}
