package org.ssm.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.mapper.EmployeeMapper;
import org.ssm.pojo.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;

    public PageInfo<Employee> getAllEmps(int pageNum) {
        PageHelper.startPage(pageNum,4);
        List<Employee> list = employeeMapper.getAllEmps();
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(list);
        return pageInfo;
    }
}
