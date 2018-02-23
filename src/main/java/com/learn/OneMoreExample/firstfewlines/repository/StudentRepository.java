package com.learn.OneMoreExample.firstfewlines.repository;

import com.learn.OneMoreExample.firstfewlines.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
