package com.temcode.factory;

import com.temcode.entity.Employee;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.temcode.factory.EmployeeFactory.*;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    void createEmployee() {
        Employee employee = EmployeeFactory.createEmployee("John", "Barnes");
        assertEquals("John", employee.getFirstName());
    }

    @Test
    void testCreateEmployee() {
        Employee employee = EmployeeFactory.createEmployee("Ernest"
                ,"Rutherford"
                , "003"
                , "Experimental Physicist"
                , "e.rutherfor@aus.com"
                , LocalDate.of(1917,10,14));

        assertNotNull(employee);

    }
}