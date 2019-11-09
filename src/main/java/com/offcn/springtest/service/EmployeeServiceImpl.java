package com.offcn.springtest.service;

import com.offcn.springtest.bean.Employee;
import com.offcn.springtest.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Resource
    private EmployeeDao employeeDao;

    //用户登录
    public Employee login(Integer eid, String ename) {
        return employeeDao.findByEidAndEname(eid,ename);
    }

    //展示用户所有数据
    @Override
    public List<Employee> showInfo() {
        return employeeDao.findAllInfo();
    }

}
