package SpringExumple;

import org.springframework.stereotype.Component;

@Component ("catBean")
public class Cat implements Pet{

    String name;

    Cat(){
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meaw");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
