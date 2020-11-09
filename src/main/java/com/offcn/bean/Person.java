package com.offcn.bean;

//CREATE TABLE person(
//	p_id INT PRIMARY KEY AUTO_INCREMENT,
//	p_name VARCHAR(20),
//	p_age INT,
//	p_depart_id INT,
//	FOREIGN KEY(p_depart_id) REFERENCES department(d_id)
//);
public class Person {
    private Integer pid;
    private String pname;
    private Integer page;
    private Department department;

    public Person() {
    }

    public Person(String pname, Integer page) {
        this.pname = pname;
        this.page = page;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                ", department=" + department +
                '}';
    }
}
