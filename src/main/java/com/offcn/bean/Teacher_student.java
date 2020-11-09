package com.offcn.bean;

public class Teacher_student {
    private Integer sid;
    private Integer tid;
    private Student student;
    private Teacher teacher;

    public Teacher_student() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Teacher_student{" +
                "sid=" + sid +
                ", tid=" + tid +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
