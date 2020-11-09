package com.offcn.bean;

import java.util.List;

//CREATE TABLE student(
//    sid INT NOT NULL AUTO_INCREMENT,
//    sname VARCHAR(30),
//    PRIMARY KEY(sid)
//);
public class Student {
    private Integer id;
    private String name;
    private  List<Teacher_student> teacher_students;

    public List<Teacher_student> getTeacher_students() {
        return teacher_students;
    }

    public void setTeacher_students(List<Teacher_student> teacher_students) {
        this.teacher_students = teacher_students;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
