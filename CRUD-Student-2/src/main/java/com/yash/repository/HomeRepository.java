package com.yash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Image;
import com.yash.model.Student;
@RestController
public interface HomeRepository extends JpaRepository<Student, Serializable> {

  public void save(Image img);

}
