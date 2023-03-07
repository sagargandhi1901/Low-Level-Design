package com.sagar.Lecture1;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee employee1 = new FullTimeEmployee();
        employee1.setEmpId(1);
        employee1.setFirstName("Sagar");
        employee1.setLastName("Gandhi");
        employee1.setAnnualSalary(600000);
        System.out.println("Name : " + employee1.getFullName());
        System.out.println("Salary : " + employee1.getSalary());

        PartTimeEmployee employee2 = new PartTimeEmployee();
        employee2.setEmpId(2);
        employee2.setFirstName("Sparsh");
        employee2.setLastName("Gandhi");
        employee2.setHourlyPay(500);
        employee2.setTotalHoursWorked(15);
        System.out.println("Name : " + employee2.getFullName());
        System.out.println("Salary : " + employee2.getSalary());
    }
}