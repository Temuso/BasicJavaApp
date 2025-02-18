package com.temcode.factory;

import com.temcode.entity.Employee;
import com.temcode.util.Helper;

public class EmployeeFactory {

    public static Employee createEmployee(String firstName,
                                          String lastName,
                                          String employeeId,
                                          String jobDescription) {


        return new Employee.Builder()
                .setJobDescription(jobDescription)
                .setLastName(lastName)
                .setFirstName(firstName)
                .setEmployeeId(employeeId)
                .build();

    }

    public static Employee createEmployee(String firstName, String lastName) {

        if (Helper.isNullorEmpty(firstName)
                || Helper.isNullorEmpty(lastName)
        ) {
            return null;
        }

        return new Employee.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }

}
