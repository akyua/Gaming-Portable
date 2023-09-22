package tk.gabrielsilvera.gaming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tk.gabrielsilvera.gaming.game.GameRunner;
import tk.gabrielsilvera.gaming.game.GamingConsole;

public class App01GamingSpringBeans {
    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext
                            (GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }

    }
}
