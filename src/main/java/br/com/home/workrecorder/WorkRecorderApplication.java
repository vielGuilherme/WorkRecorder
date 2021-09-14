package br.com.home.workrecorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WorkRecorderApplication {

    public static void main(String[] args) {

        SpringApplication.run(WorkRecorderApplication.class, args);
        System.out.println("Application started");
    }

}
