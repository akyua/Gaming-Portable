package tk.gabrielsilvera.gaming.concepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleSpringContextApplication {
    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext
                            (SimpleSpringContextApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
