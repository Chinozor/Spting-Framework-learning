package SpringExumple;


import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("SpringExumple")
public class MyConfig {

    @Bean
    @Scope ("singleton")
    public Pet catBean(){
        return new Cat();
    }

    public Person personBean(){
        return new Person(catBean());
    }
}
