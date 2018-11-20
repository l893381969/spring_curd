package com.yc.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yc.dao.EmployeeMapper;
import com.yc.po.Employee;

public class TestEmployee {
	
	@Test
	public void testselectemp(){
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sessionfactory = (SqlSessionFactory) atx.getBean("sqlSessionFactory");
		SqlSession session = sessionfactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		Employee emp = new Employee();
		List<Employee> list = mapper.selectemp(emp);
		System.out.println(list);
	}
	
	@Test
	public void testinsertemp(){
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sessionfactory = (SqlSessionFactory) atx.getBean("sqlSessionFactory");
		SqlSession session = sessionfactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		boolean a = mapper.insertemp(new Employee(8,"�з���", "dd@qq.com", "��", new Date(), (float) 8000, null));
		System.out.println(a);
		
	}
	
	@Test
	public void testdeleteemp(){
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sessionfactory = (SqlSessionFactory) atx.getBean("sqlSessionFactory");
		SqlSession session = sessionfactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		boolean a = mapper.deleteemp(4);
		System.out.println(a);
	}
	
	@Test
	public void testupdateemp(){
		ApplicationContext atx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sessionfactory = (SqlSessionFactory) atx.getBean("sqlSessionFactory");
		SqlSession session = sessionfactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		Employee emp = new Employee();
		emp.setId(1);
		emp.setLastname("�з���");
		emp.setEmail("89@qq.com");
		emp.setGender("��");
		emp.setSalary((float) 10000);
		boolean a = mapper.updateemp(emp);
		System.out.println(a);
	}
}
