package mum.eregistrar.eregistrarapp.repositories;

import mum.eregistrar.eregistrarapp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // This interface definition relies on the public abstract methods
    // inherited from the super interface, CrudRepository<T, ID>
    // We may override any or add more methods here, if needed.
    @Query("SELECT s FROM Student s WHERE CONCAT(s.id, ' '" +
            ", s.studentNumber,' '" +
            ",s.firstName,' '" +
            ",s.middleName,' '" +
            ",s.lastName,' '," +
            "s.cgpa,' '," +
            "s.dateOfEnrollment,' '," +
            "s.isInternational,' ' ) LIKE CONCAT('%', :search, '%')")
    List<Student> searchByString(@Param("search") String search);
}
