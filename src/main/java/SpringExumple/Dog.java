package SpringExumple;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class Dog implements Pet {

    Dog(){
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("AVAVAV");
    }
}
