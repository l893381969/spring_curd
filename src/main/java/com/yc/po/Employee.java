package com.yc.po; 

import java.util.Date;
 
public class Employee {

	private Integer id;
	 
	private String lastname;
	 
	private String email;
	 
	private String gender;
	
	private Date birth;	 
	
	private Float salary;
	 
	private Department department;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Employee(Integer id,String lastname, String email, String gender, Date birth, Float salary,
			Department department) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.birth = birth;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + ", email=" + email + ", gender=" + gender + ", birth="
				+ birth + ", salary=" + salary + ", department=" + department + "]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
