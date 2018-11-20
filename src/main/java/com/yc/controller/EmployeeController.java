package com.yc.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.EmployeeBiz;
import com.yc.biz.Impl.EmployeeBizImpl;
import com.yc.po.Employee;

@Controller
public class EmployeeController {
	
	EmployeeBiz biz = new EmployeeBizImpl();
	
	@RequestMapping(value="/selectemp",method={RequestMethod.POST})
	@ResponseBody
	public List<Employee> selectemp(){
		Employee emp = new Employee();
		List<Employee> list = biz.selectemp(emp);
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value="/insertemp",method={RequestMethod.POST})
	@ResponseBody
	public boolean insertemp(Employee emp){
		boolean a = biz.insertemp(new Employee(emp.getId(),emp.getLastname(), emp.getEmail(), emp.getGender(), emp.getBirth(), emp.getSalary(), null));
		return a;
	}
	
	@RequestMapping(value="/deleteemp",method={RequestMethod.DELETE})
	@ResponseBody
	public boolean deleteemp(Employee emp){
		System.out.println(emp);
		boolean a = biz.deleteemp(emp.getId());
		return a;
	}
	
	@RequestMapping("/updateemp")
	@ResponseBody
	public boolean updateemp(Employee emp){
		System.out.println(emp);
		boolean a = biz.updateemp(emp);
		return a;
	}
	
}
