package com.ttn.springData.demos;

import com.ttn.springData.config.PersistenceContext;
import com.ttn.springData.entity.Employee;
import com.ttn.springData.repositories.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.ListIterator;

public class Demo1 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);

        EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);

        Employee employee = new Employee();
        employee.setAge(27);
        employee.setName("Peter");
        employee.setSalary(20000);
        employeeRepository.save(employee); // Saving into the Database
        System.out.println("Employee Saved successfully");

        // findOne(ID id) method
       /* Employee employee1 = employeeRepository.findOne(1);
        System.out.println(employee1.toString());*/

        // exists(ID id) method
        /*System.out.println(employeeRepository.exists(1));
        System.out.println(employeeRepository.exists(2));*/

        // findAll() method
        /*List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
        ListIterator iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/

        // count() method
//        System.out.println(employeeRepository.count());

        // delete(ID id) method
//        employeeRepository.delete(1);

    }
}
