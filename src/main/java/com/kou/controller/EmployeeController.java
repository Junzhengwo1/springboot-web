package com.kou.controller;

import com.kou.dao.DepartmentDao;
import com.kou.dao.EmployeeDao;
import com.kou.pojo.Department;
import com.kou.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @author JIAJUN KOU
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;


    @RequestMapping("/findAll")
    public String findAll(Model model){
        Collection<Employee> employees = employeeDao.getAll();

        model.addAttribute("emps",employees);

        return "list";
    }

    @GetMapping("/addEmp")
    public String addEmp( Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        System.out.println(departments);

        return "add";
    }

    /**
     * 把前端传过来的员工数据 添加到数据库中。这里模拟的数据就是map集合中
     * @param employee
     * @return
     */
    @PostMapping("/toList")
    public String toList( Employee employee){
        //添加的操作forward
        //调用dao层 保存前端传过来的数据
        employeeDao.save(employee);

        return "redirect:/emp/findAll";
    }
}
