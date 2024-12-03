package com.example.crud_opps.repository;

import com.example.crud_opps.model.Employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Object save(Optional<Employee> employee);

    void deleteById(Optional<Employee> employee);
}
