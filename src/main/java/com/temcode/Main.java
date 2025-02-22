package com.temcode;

import com.temcode.entity.Employee;
import com.temcode.entity.SortByLastName;
import com.temcode.factory.EmployeeFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee anEmployee = EmployeeFactory.createEmployee("Niels","Bohr");

        Employee anotherEmployee = EmployeeFactory.createEmployee("Albert",
                "Einstein",
                "0001",
                "Theoretical Physicist",
                "albert.einstein@physics.com");

        Employee yetAnother = EmployeeFactory.createEmployee("Marie",
                "Curie",
                "0003",
                "Discoverer of Radium",
                "marie.curie@physics.com");

        System.out.println(anEmployee);
        System.out.println(anotherEmployee);
        System.out.println(yetAnother);


        List<Employee> employees = new ArrayList<Employee>();

        Collections.addAll(employees, anEmployee, anotherEmployee, yetAnother);

        employees.iterator().forEachRemaining(System.out::println);

        Collections.sort(employees, new SortByLastName());

        // employees.sort(new SortByLastName());

        for (Employee employee : employees) {
            System.out.println(employee);
        }


        }
    }