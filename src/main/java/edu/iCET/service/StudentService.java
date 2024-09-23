package edu.iCET.service;

import edu.iCET.dto.Student;
import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List<Student> getStudent();
    List<Student> findByName(String name);
}
