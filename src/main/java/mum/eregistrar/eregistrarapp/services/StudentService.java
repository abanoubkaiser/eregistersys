package mum.eregistrar.eregistrarapp.services;


import mum.eregistrar.eregistrarapp.models.Student;

import java.util.List;

public interface StudentService {

    public abstract Iterable<Student> getAllStudents();
    public abstract Student saveStudent(Student student);
    public abstract Student getStudentById(Long studentId);
    public abstract void deleteStudentById(Long studentId);
    public abstract List<Student> searchStudents(String searchString);

}
