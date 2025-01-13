package SpringExumple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component ("personBean")
public class Person {

    @Autowired
    @Qualifier("catBean")
    Pet pet;

    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    /*@Autowired
    Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }

    Person(){
        System.out.println("Person bean is created");
    }

//    @Autowired
    public void setPet(Pet pet){
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getAge(){
        return this.age;
    }

    public String getSurname(){
        return  this.surname;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely pet");
        pet.say();
    }
}
