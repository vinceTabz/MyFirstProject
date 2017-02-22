package com.company.classes;

/**
 * Created by jpmc on 2/17/2017.
 */
public class Employee extends User {
    public String intruduceMyself(String firstName, String lastName, String middleName) {
        return "Employee: " + firstName + " " + lastName + " "+middleName;


      /*  String department;
    String payGrade;
    String employeeId;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getPayGrade() {
        return payGrade;
    }

    public String getEmployeeId() {
        return employeeId;*/
    }
}
