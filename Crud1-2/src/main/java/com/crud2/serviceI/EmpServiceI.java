package com.crud2.serviceI;

import java.util.List;

import com.crud2.model.Employee;

public interface EmpServiceI {

	 public void saveEmp(Employee e);

	 public List<Employee>  getData(String username, String password);

	public List<Employee> updateEmp(Employee e);

	public Employee editemp(int id);

	public List<Employee> deleteEmp(int id);

	public List<Employee> paging(int pageNo, int size);
	

}
