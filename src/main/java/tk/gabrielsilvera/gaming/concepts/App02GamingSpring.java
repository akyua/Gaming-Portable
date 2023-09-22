package tk.gabrielsilvera.gaming.concepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingSpring {
    public static void main(String[] args) {
        //Launch a Spring Context
        try(var context = new AnnotationConfigApplicationContext(AppConfiguration.class)) {

            //Configure the things that we want Spring to manage - @Configuration
            // name - @Bean

            //Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean(Person.class));
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }


    }
}
