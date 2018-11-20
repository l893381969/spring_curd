package com.yc.biz;

import java.util.List;

import com.yc.po.Employee;

public interface EmployeeBiz {

	public List<Employee> selectemp(Employee emp);
	
	public boolean insertemp (Employee emp);
	
	public boolean deleteemp(Integer id);
	
	public boolean updateemp(Employee emp);
}
