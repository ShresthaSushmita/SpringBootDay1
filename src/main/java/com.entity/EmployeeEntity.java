package com.entity;

import javax.persistence.*;

@Entity  //table creation
@Table(name="emp_tbl")  //table name ----> emp_tbl
public class EmployeeEntity {
    int employeeId;
    String employeeName;
    int salary;
    String emailId;
    String password;

    public EmployeeEntity() {
        super();
    }

    public EmployeeEntity(int employeeId, String employeeName, int salary, String emailId, String password) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.emailId = emailId;
        this.password = password;
    }

    @Id    //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
