package my.demo.repository;

import my.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author nid
 */
@Mapper
public interface StudentRepository {

    /**
     * @param id
     * @return Student object
     */
    Student findById(int id);

    /**
     * @param student
     * @return insert count
     */
    int insert(Student student);

    /**
     * @param student
     * @return update count
     */
    int update(Student student);

    /**
     * @param id
     * @return deleted count
     */
    int delete(int id);
}
