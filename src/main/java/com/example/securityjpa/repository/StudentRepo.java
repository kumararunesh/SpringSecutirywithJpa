package com.example.securityjpa.repository;

import com.example.securityjpa.models.student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<student,Integer> {
}
