package com.aio.springboot.springbootcrudrestfullwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aio.springboot.springbootcrudrestfullwebservices.model.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
