package com.ttn.springData.repositories;

import com.ttn.springData.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findByName(String name);

    Employee findById(Integer id);
}
