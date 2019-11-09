package com.offcn.springtest.service;

import com.offcn.springtest.bean.Employee;

import java.util.List;

public interface EmployeeService {

    Employee login(Integer eid, String ename);

    List<Employee> showInfo();
}
