package ra.springmvc.model.dao;

import ra.springmvc.model.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> findAll();
    boolean create(Student student);
    void update(Student student);
    void deleteById(Integer id);
    Student findById(Integer id);
}