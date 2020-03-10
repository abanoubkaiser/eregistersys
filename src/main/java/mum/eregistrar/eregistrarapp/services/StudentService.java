package mum.eregistrar.eregistrarapp.services;


import mum.eregistrar.eregistrarapp.models.Student;

public interface StudentService {

    public abstract Iterable<Student> getAllStudents();
    public abstract Student saveStudent(Student student);
    public abstract Student getStudentById(Long studentId);
    public abstract void deleteStudentById(Long studentId);

}
