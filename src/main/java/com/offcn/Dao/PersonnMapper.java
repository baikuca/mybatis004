package com.offcn.Dao;

import com.offcn.bean.Person;

import java.util.List;

public interface PersonnMapper {
    public List<Person> selecctPersonByDid(int did);
}
