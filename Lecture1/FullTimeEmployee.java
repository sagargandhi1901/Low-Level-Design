package com.sagar.Lecture1;

public class FullTimeEmployee extends Employee {

    private int annualSalary;

    @Override
    public int getSalary() {
        return annualSalary;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }
}
