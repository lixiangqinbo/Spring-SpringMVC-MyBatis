package org.ssm.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssm.pojo.Employee;
import org.ssm.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
    @RequestMapping(value = "employee/{pageNum}",method = RequestMethod.GET)
    public  String getAllEmps(Model model,@PathVariable("pageNum") int pageNum){
        System.out.println(pageNum);
        PageInfo<Employee> allEmps = employeeService.getAllEmps(pageNum);
        model.addAttribute("page",allEmps);
        return "emp_list";
    }
}
