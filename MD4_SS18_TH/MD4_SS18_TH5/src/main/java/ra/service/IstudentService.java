package ra.service;

import ra.model.Student;

import java.util.List;

public class IstudentService {
    public interface IStudentService {
        List<Student> findAll();

        Student findById(Long id);
    }
}
