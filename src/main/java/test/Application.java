package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by izeye on 2014. 11. 6..
 */
@Configuration
@EnableAutoConfiguration
public class Application {

    @Bean
    public InterfaceA beanA() {
        return new ClassA();
    }

    @Autowired
//    private ClassA beanA;
    private InterfaceA beanA;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
