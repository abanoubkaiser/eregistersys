package mum.eregistrar.eregistrarapp.services.impl;
import mum.eregistrar.eregistrarapp.models.Student;
import mum.eregistrar.eregistrarapp.repositories.StudentRepository;
import mum.eregistrar.eregistrarapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
