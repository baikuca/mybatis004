package com.offcn.bean;

import java.util.List;

//CREATE TABLE department(
//	d_id INT PRIMARY KEY AUTO_INCREMENT,
//	d_name VARCHAR(20)
//);
public class Department {
    private Integer did;
    private String dname;
    private List<Person> people;

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public Department(String dname) {
        this.dname = dname;
    }

    public Department() {
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
