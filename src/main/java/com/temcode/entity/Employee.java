package com.temcode.entity;

public class Employee {
    private String firstName;
    private String lastName;
    private String employeeId;
    private String jobDescription;

    private Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }

    private Employee(String firstName, String lastName, String employeeId, String jobDescription) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.jobDescription = jobDescription;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String employeeId;
        private String jobDescription;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }

        public Employee build() {
            return new Employee(firstName, lastName, employeeId, jobDescription);
        }

    }
}
