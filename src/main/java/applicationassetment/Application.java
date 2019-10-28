package applicationassetment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        With static methods, you don't have to instantiate an object of the class, you just reference the class directly
        SpringApplication.run(Application.class, args);
    }
}

