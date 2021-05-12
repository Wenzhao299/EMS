package com.ems.mapper;

import com.ems.entity.Emp;

import java.util.List;

public interface EmpMapper {
    List<Emp> findAll();
    void addEmp(Emp emp);
    void delete(String id);
    Emp findById(String id);
    void update(Emp emp);
}
