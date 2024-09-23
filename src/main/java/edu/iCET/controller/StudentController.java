package edu.iCET.controller;

import edu.iCET.dto.Student;
import edu.iCET.repository.StudentRepository;
import edu.iCET.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
@Slf4j
public class StudentController {
    final StudentService service;
    final StudentRepository repository;

    @GetMapping("/all")
    public List<Student> getStudent(){
        return service.getStudent();
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student, HttpServletRequest request){
        String os = request.getHeader("sec-ch-ua");
        log.info("Request recieved {}|{}",student,os);
        service.addStudent(student);
        return "Student registered Successfully!";
    }

    @GetMapping("/findByName={name}")
    public Student findStudent(@PathVariable String name){
        return service.findByName(name);
    }
}
