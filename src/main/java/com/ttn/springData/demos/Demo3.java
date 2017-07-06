package com.ttn.springData.demos;

import com.ttn.springData.config.PersistenceContext;
import com.ttn.springData.entity.Employee;
import com.ttn.springData.repositories.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.ListIterator;

public class Demo3 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);

        EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);

        // int countById(Integer id);
//        System.out.println(employeeRepository.countById(1));

        // List<Employee> findFirstByName(String name);
        /*List<Employee> employeeList = employeeRepository.findFirstByName("Peter");
        ListIterator iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/

        // List<Employee> findFirst3ByName(String name);
        /*List<Employee> employeeList = employeeRepository.findFirst3ByName("Peter");
        ListIterator iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/

        /*Employee employee = new Employee();
        employee.setAge(25);
        employee.setName("Tester");
        employee.setSalary(15000);
        employeeRepository.save(employee);

        Employee employee = new Employee();
        employee.setAge(21);
        employee.setName("Tester1");
        employee.setSalary(10000);
        employeeRepository.save(employee);*/

        // Employee findDistinctByName(String name);
        /*Employee employee = employeeRepository.findDistinctByName("Tester");
        System.out.println(employee.toString());*/

        // List<Employee> findByNameOrAge(String name, Integer age);
        /*List<Employee> employeeList = employeeRepository.findByNameOrAge("Tester", 21);
        ListIterator iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/

    }
}
