package com.ems.service;

import com.ems.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> findAll();
    void addEmp(Emp emp);
    void delete(String id);
    Emp findById(String id);
    void update(Emp emp);
}
