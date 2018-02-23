package com.learn.OneMoreExample.firstfewlines.service;

import com.learn.OneMoreExample.firstfewlines.domain.Student;
import com.learn.OneMoreExample.firstfewlines.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public Iterable<Student> getStudents(){
        return studentRepository.findAll();
    }
}
