package com.yc.biz.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.biz.EmployeeBiz;
import com.yc.dao.EmployeeMapper;
import com.yc.po.Employee;

public class EmployeeBizImpl implements EmployeeBiz {
	
	public List<Employee> selectemp(Employee emp) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sessionfactory = (SqlSessionFactory) atx.getBean("sqlSessionFactory");
		SqlSession session = sessionfactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		return mapper.selectemp(emp);
		
	}

	public boolean insertemp(Employee emp) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sessionfactory = (SqlSessionFactory) atx.getBean("sqlSessionFactory");
		SqlSession session = sessionfactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		return mapper.insertemp(emp);
	}

	public boolean deleteemp(Integer id) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sessionfactory = (SqlSessionFactory) atx.getBean("sqlSessionFactory");
		SqlSession session = sessionfactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		return mapper.deleteemp(id);
	}

	public boolean updateemp(Employee emp) {
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sessionfactory = (SqlSessionFactory) atx.getBean("sqlSessionFactory");
		SqlSession session = sessionfactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		return mapper.updateemp(emp);
	}

}
