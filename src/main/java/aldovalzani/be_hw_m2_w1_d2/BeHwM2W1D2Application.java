package aldovalzani.be_hw_m2_w1_d2;

import aldovalzani.be_hw_m2_w1_d2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeHwM2W1D2Application {

    public static void main(String[] args) {
        SpringApplication.run(BeHwM2W1D2Application.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppManager.class);
        Menu menu = (Menu) context.getBean("menu");
        menu.stampaMenu();
    }

}
