package com.temcode.factory;

import com.temcode.entity.Employee;
import com.temcode.util.Helper;

public class EmployeeFactory {

    public static Employee createEmployee(String firstName,
                                          String lastName,
                                          String employeeId,
                                          String jobDescription,
                                          String email) {


        return new Employee.Builder()
                .setId(Helper.generateId())
                .setJobDescription(jobDescription)
                .setLastName(lastName)
                .setFirstName(firstName)
                .setEmployeeId(employeeId)
                .setEmail(email)
                .build();
    }

    public static Employee createEmployee(String firstName, String lastName) {

        if (Helper.isNullorEmpty(firstName)
                || Helper.isNullorEmpty(lastName)
        ) {
            return null;
        }

        return new Employee.Builder()
                .setId(Helper.generateId())
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }

}
