package SpringExumple;

public class Person {

    Pet pet;

    private String surname;
    private int age;

    /*Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }*/

    Person(){
        System.out.println("Person bean is created");
    }

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
