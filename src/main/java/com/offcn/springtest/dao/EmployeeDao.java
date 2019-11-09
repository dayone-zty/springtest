package com.offcn.springtest.dao;

import com.offcn.springtest.bean.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeDao extends PagingAndSortingRepository<Employee,Integer> {
    //通过id和用户名进行查询
    public Employee findByEidAndEname(Integer eid,String ename);

    @Query("from employee")
    List<Employee> findAllInfo();

    /*@Query("from Employee.e where e.eid=?1 and e.ename=?2" )
    public Employee findByEidAndEname(Integer eid,String ename);*/
}
