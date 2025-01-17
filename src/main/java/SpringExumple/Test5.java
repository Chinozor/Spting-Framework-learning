package SpringExumple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();

        Pet cat = context.getBean("catBean", Cat.class);
        Pet cat1 = context.getBean("catBean", Cat.class);
        cat.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());

    }
}
