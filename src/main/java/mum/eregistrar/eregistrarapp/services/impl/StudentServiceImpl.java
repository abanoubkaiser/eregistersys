package mum.eregistrar.eregistrarapp.services.impl;
import mum.eregistrar.eregistrarapp.models.Student;
import mum.eregistrar.eregistrarapp.repositories.StudentRepository;
import mum.eregistrar.eregistrarapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.*;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Iterable<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return repository.findById(studentId).orElse(null);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        repository.deleteById(studentId);
    }

    @Override
    public List<Student> searchStudents(String searchString) {

       return repository.searchByString(searchString);
       // return null;
    }

}
