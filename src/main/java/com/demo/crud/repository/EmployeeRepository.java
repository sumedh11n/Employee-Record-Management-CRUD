package com.demo.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}