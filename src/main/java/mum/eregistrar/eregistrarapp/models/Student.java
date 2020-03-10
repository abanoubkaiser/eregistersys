package mum.eregistrar.eregistrarapp.models;



import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private options isInternational;
    @NotNull
    private String studentNumber;
    @NotNull
    private String firstName;
    private String middleName;
    @NotNull
    private String lastName;
    private double cgpa;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfEnrollment;
    public enum options {
        NO,
        YES
    }
    public Student() {
    }

    public Student( String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment,options isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.cgpa = cgpa;
        this.dateOfEnrollment=dateOfEnrollment;
        this.isInternational=isInternational;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public options getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(options isInternational) {
        this.isInternational = isInternational;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollment=" + dateOfEnrollment +
                ", isInternational=" + isInternational +

                '}';
    }
}