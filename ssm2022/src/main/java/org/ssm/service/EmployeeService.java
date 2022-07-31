package org.ssm.service;

import com.github.pagehelper.PageInfo;
import org.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    public PageInfo<Employee> getAllEmps(int pageNum);
}
