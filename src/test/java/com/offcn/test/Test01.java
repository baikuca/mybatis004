package com.offcn.test;

import com.offcn.Dao.DepartmenttMapper;
import com.offcn.Dao.PersonnMapper;
import com.offcn.Dao.StudentMapper;
import com.offcn.Tool.UDuir;

import com.offcn.bean.Department;
import com.offcn.bean.Person;
import com.offcn.bean.Student;
import com.offcn.bean.Teacher_student;
import org.junit.Test;

import java.util.List;

public class Test01 extends UDuir {
    @Test
    public void Test1(){
        PersonnMapper mapper = sqlSession.getMapper(PersonnMapper.class);
        List<Person> lists = mapper.selecctPersonByDid(1);
        System.out.println(lists);
    }
    @Test
    public void Test2(){
        DepartmenttMapper mapper = sqlSession.getMapper(DepartmenttMapper.class);
        Department department = mapper.selectDepartmentByDid(1);
        System.out.println(department.getPeople()+" /// " +department);

    }
    @Test
    public void Test3(){
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student sudentByID = mapper.getSudentByID(1);
        System.out.println(sudentByID.getName());
        for (Teacher_student teacher_student:sudentByID.getTeacher_students()){
            System.out.println(teacher_student.getTeacher());
        }


    }
}
