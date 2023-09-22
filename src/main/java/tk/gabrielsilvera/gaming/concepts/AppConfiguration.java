package tk.gabrielsilvera.gaming.concepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String city, int number){};
@Configuration
public class AppConfiguration {
    @Bean
    public String name(){
        return "aky";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public Person person(){
        return new Person("Aky", 21, new Address("Biguaçu", 103));

    }

    @Bean
    public Address address(){
        return new Address("Biguaçu", 877);
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    @Primary
    public Person person3Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }
}
