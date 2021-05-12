package com.ems.controller;

import com.ems.entity.Emp;
import com.ems.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<Emp> emps = empService.findAll();
        model.addAttribute("emps",emps);
        return "ems/emplist";
    }

    @PostMapping("/addEmp")
    public String addEmp(Emp emp){
        empService.addEmp(emp);
        return "redirect:/emp/findAll";
    }

    @GetMapping("/delete")
    public String delete(String id){
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    @GetMapping("findById")
    public String findById(String id, Model model){
        Emp emp = empService.findById(id);
        model.addAttribute("emp",emp);
        return "ems/updateEmp";
    }

    @PostMapping("/update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/findAll";
    }
}
