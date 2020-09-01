package com.assignment.wander.covid19dashboard.model;

public class Employee {

    private long empId;
    private String name;
    private String designation;
    private double salary;

    public Employee(long empId, String name, String designation, double salary) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(){

    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getEmpId() != employee.getEmpId()) return false;
        if (Double.compare(employee.getSalary(), getSalary()) != 0) return false;
        if (getName() != null ? !getName().equals(employee.getName()) : employee.getName() != null) return false;
        return getDesignation() != null ? getDesignation().equals(employee.getDesignation()) : employee.getDesignation() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (getEmpId() ^ (getEmpId() >>> 32));
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDesignation() != null ? getDesignation().hashCode() : 0);
        temp = Double.doubleToLongBits(getSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
