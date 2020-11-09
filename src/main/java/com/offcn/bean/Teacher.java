package com.offcn.bean;

import java.util.List;

//CREATE TABLE teacher(
//    tid INT NOT NULL AUTO_INCREMENT,
//    tname VARCHAR(30),
//    PRIMARY KEY(tid)
//);
public class Teacher {
    private Integer id;
    private String name;
    private List<Teacher_student> teacher_students;

    public List<Teacher_student> getTeacher_students() {
        return teacher_students;
    }

    public void setTeacher_students(List<Teacher_student> teacher_students) {
        this.teacher_students = teacher_students;
    }

    public Teacher() {
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher_students=" + teacher_students +
                '}';
    }
}
