package com.temcode;

import com.temcode.entity.Employee;
import com.temcode.factory.EmployeeFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Employee anEmployee = EmployeeFactory.createEmployee("Niels","Bohr");

            Employee anotherEmployee = EmployeeFactory.createEmployee("Albert",
                    "Einstein",
                    "0001",
                    "Theoretical Physicist",
                    "albert.einstein@physics.wld");

        System.out.println(anEmployee);
        System.out.println(anotherEmployee);
        }
    }