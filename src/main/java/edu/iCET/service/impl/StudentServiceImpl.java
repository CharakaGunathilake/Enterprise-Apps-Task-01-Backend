package edu.iCET.service.impl;

import edu.iCET.dto.Student;
import edu.iCET.repository.StudentRepository;
import edu.iCET.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    final StudentRepository repository;

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public List<Student> getStudent() {
        return repository.findAll();
    }

    @Override
    public List<Student> findByName(String name) {
        return repository.findByName(name);
    }
}
