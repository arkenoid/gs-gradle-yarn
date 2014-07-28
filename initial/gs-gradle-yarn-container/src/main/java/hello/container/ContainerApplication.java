package hello.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by arke on 28/07/14.
 */
@EnableAutoConfiguration
public class ContainerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContainerApplication.class, args);
    }
}
