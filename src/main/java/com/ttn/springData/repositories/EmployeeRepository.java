package com.ttn.springData.repositories;

import com.ttn.springData.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

//    List<Employee> findByName(String name);

//    Employee findById(Integer id);

    /*@Query("SELECT name from Employee where id=:id")
    String findById(@Param("id") Integer id);*/

    /*@Query("SELECT id, name from Employee where id=:id")
    List<Object[]> findById(@Param("id") Integer id);*/

    /*@Query("SELECT e from Employee e where id=:id")
    Employee findById(@Param("id") Integer id);*/

    /*@Query("SELECT Count(*) from Employee e where name=:name")
    Integer countByName(@Param("name") String name);*/

//    int countById(Integer id);

//    List<Employee> findFirstByName(String name);

//    List<Employee> findFirst3ByName(String name);

//    Employee findDistinctByName(String name);

//    List<Employee> findByNameOrAge(String name, Integer age);

//    List<Employee> findByNameIs(@Param("name") String name);

//    List<Employee> findByNameOrderByIdDesc(String name);

//    List<Employee> findAll(Sort sort);

    Page<Employee> findAll(Pageable pageable);
}
