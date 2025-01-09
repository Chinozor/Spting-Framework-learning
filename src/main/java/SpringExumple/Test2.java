package SpringExumple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        Pet pet1 = context.getBean("myCat", Pet.class);
        pet1.say();
        pet.say();

        context.close();
    }
}
