package com.offcn.springtest.dao;

import com.offcn.springtest.bean.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeptDao extends PagingAndSortingRepository<Employee,Integer> {
}
