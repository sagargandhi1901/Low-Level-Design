package com.sagar.Lecture1;

public class PartTimeEmployee extends Employee {

    private int hourlyPay;
    private int totalHoursWorked;

    @Override
    public int getSalary() {
        return hourlyPay * totalHoursWorked;
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public int getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(int totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
}
