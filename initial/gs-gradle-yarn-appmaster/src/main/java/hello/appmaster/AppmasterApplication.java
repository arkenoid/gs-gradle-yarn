package hello.appmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by arke on 28/07/14.
 */
@EnableAutoConfiguration
public class AppmasterApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppmasterApplication.class, args);
    }
}
