package ru.mirea.laba9-10;

public class Operator extends Empoley implements EmployeePosition {
    public Operator(String name,String Surname) {
        super(name, Surname);

    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

}
