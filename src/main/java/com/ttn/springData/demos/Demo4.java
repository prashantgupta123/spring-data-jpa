package com.ttn.springData.demos;

import com.ttn.springData.config.PersistenceContext;
import com.ttn.springData.entity.Employee;
import com.ttn.springData.repositories.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

public class Demo4 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);

        EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);

        // List<Employee> findByNameIs(@Param("name") String name);
        /*List<Employee> employeeList = employeeRepository.findByNameIs("Peter");
        ListIterator iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/

        // List<Employee> findByNameOrderByIdDesc(String name);
        /*List<Employee> employeeList = employeeRepository.findByNameOrderByIdDesc("Peter");
        ListIterator iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/

        // List<Employee> findAll(Sort sort);
        /*List<Employee> list = employeeRepository.findAll(new Sort(Sort.Direction.DESC, "age").and(
                new Sort(Sort.Direction.ASC, "name")));
        System.out.println(list);*/

        Page<Employee> employeePage = employeeRepository.findAll(new PageRequest(0, 3, new Sort(Sort.Direction.DESC, "id")));
        List<Employee> employeeList = employeePage.getContent();
        System.out.println(employeeList);

    }
}
