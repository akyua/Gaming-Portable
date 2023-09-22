package tk.gabrielsilvera.gaming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.gabrielsilvera.gaming.game.GameRunner;
import tk.gabrielsilvera.gaming.game.GamingConsole;

@Configuration
@ComponentScan("tk.gabrielsilvera.gaming.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        try(var context =
                    new AnnotationConfigApplicationContext
                            (GamingAppLauncherApplication.class)){
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }

    }
}
