package com.kou.pojo;

import java.util.Date;

/**
 * @author JIAJUN KOU
 */

public class Employee {
    private Integer id;
    private String emName;
    private Integer gender;

    private Department department;
    private Date birth;

    public Employee() {
    }

    public Employee(Integer id, String emName, Integer gender, Department department) {
        this.id = id;
        this.emName = emName;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", emName='" + emName + '\'' +
                ", gender=" + gender +
                ", department=" + department +
                ", birth=" + birth +
                '}';
    }
}
