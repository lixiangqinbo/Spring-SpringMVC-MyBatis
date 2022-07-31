package org.ssm.mapper;

import org.springframework.stereotype.Repository;
import org.ssm.pojo.Employee;

import java.util.List;
@Repository
public interface EmployeeMapper {

    public List<Employee> getAllEmps();
}
