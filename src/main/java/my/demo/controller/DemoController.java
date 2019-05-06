package my.demo.controller;

import my.demo.entity.Student;
import my.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("view")
    public Student view(int id){

        return studentRepository.findById(id);
    }

}
