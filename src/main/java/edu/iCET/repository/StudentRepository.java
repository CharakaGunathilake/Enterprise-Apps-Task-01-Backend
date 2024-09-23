package edu.iCET.repository;

import edu.iCET.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByName(String name);
}
