package com.ttn.springData.demos;

import com.ttn.springData.config.PersistenceContext;
import com.ttn.springData.entity.Employee;
import com.ttn.springData.repositories.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.ListIterator;

public class Demo2 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);

        EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);

        // Employee findById(Integer id);
        /*Employee employee1 = employeeRepository.findById(1);
        System.out.println(employee1.toString());*/

        // List<Employee> findByName(String name);
        /*List<Employee> employeeList = employeeRepository.findByName("Peter");
        ListIterator iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/

        // @Query("SELECT name from Employee where id=:id")
        // findById(@Param("id") Integer id) method
//        System.out.println(employeeRepository.findById(1));

        // @Query("SELECT id, name from Employee where id=:id")
        // List<Object[]> findById(@Param("id") Integer id);
        /*List<Object[]> objects = employeeRepository.findById(1);
        ListIterator iterator = objects.listIterator();
        while (iterator.hasNext()){
            Object[] o = (Object[]) iterator.next();
            System.out.println(o[0]);
            System.out.println(o[1]);
        }*/

        // @Query("SELECT e from Employee e where id=:id")
        // Employee findById(@Param("id") Integer id);
        /*Employee employee = employeeRepository.findById(1);
        System.out.println(employee.toString());*/

        //  @Query("SELECT Count(*) from Employee e where name=:name")
        // Integer countByName(@Param("name") String name);
//        System.out.println(employeeRepository.countByName("Peter"));

    }
}
