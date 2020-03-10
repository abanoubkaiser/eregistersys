package mum.eregistrar.eregistrarapp.repositories;

import mum.eregistrar.eregistrarapp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // This interface definition relies on the public abstract methods
    // inherited from the super interface, CrudRepository<T, ID>
    // We may override any or add more methods here, if needed.
}
