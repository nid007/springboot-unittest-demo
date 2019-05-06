package my.demo.controller;

import my.demo.entity.Student;
import my.demo.repository.StudentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTest {
    private  String title = "Controller";

    @Autowired
    DemoController controller;

    @Before
    public void beforeTest(){

        StudentRepository repository = mock(StudentRepository.class);
        controller.setStudentRepository(repository);

        Student student = new Student();
        student.setTitle(title);
        student.setId(1);

        when(repository.findById(1)).thenReturn(student);
        when(repository.findById(2)).thenThrow(new RuntimeException("hehe"));
    }
    @Test
    public void test(){
        Student student = controller.view(2);
        assertEquals(student.getId().intValue(),1);
        assertEquals(student.getTitle(),title);
    }
}
