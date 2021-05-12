package com.ems.service.impl;

import com.ems.entity.Emp;
import com.ems.mapper.EmpMapper;
import com.ems.service.EmpService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public void addEmp(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empMapper.addEmp(emp);
    }

    @Override
    public void delete(String id) {
        empMapper.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Emp findById(String id) {
        return empMapper.findById(id);
    }

    @Override
    public void update(Emp emp) {
        empMapper.update(emp);
    }
}
