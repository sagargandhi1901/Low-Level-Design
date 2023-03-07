package com.sagar.Lecture1;

public abstract class Employee {

    private int empId;
    private String firstName;
    private String lastName;

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public abstract int getSalary();

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
