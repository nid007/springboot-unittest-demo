package my.demo;

import my.demo.entity.Student;
import my.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author nid
 */
@SpringBootApplication
public class DbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbDemoApplication.class, args);
    }

}
