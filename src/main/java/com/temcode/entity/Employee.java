package com.temcode.entity;

public class Employee {


    private String id;
    private String firstName;
    private String lastName;
    private String employeeId;
    private String jobDescription;
    private String email;

    private Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private Employee(String id, String firstName, String lastName, String employeeId, String jobDescription, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.jobDescription = jobDescription;
    }

    public String getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public static class Builder {
        private String id;
        private String firstName;
        private String lastName;
        private String employeeId;
        private String jobDescription;
        private String email;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

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

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Employee build() {
            return new Employee(id, firstName, lastName, employeeId, jobDescription, email);
        }

    }
}
