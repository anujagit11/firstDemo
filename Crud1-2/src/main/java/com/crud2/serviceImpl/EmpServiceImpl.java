package com.crud2.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crud2.Repository.EmployeeRepository;
import com.crud2.model.Employee;
import com.crud2.serviceI.EmpServiceI;

@Service
public class EmpServiceImpl implements EmpServiceI{
 
	@Autowired
	EmployeeRepository repository;
	
	@Override
	public void saveEmp(Employee e) {
		repository.save(e);
	}

	@Override
	public List<Employee> getData(String username, String password) {
		if(username.equals("ADMIN") && password.equals("ADMIN"))
		{
			List<Employee> list=repository.findAll();
			return list;
		}
		else
		{
			List<Employee> list=repository.findByUsernameAndPassword(username, password);
			return list;
		}
	}

	@Override
	public List<Employee> updateEmp(Employee e) {
		repository.save(e);
		return  (List<Employee>) repository.findAll();
	}

	@Override
	public Employee editemp(int id) {
		Optional<Employee> op=repository.findById(id);
		if(op.isPresent())
		{
			return op.get();
		}
		else
		{
		return null;
		}
	}

	@Override
	public List<Employee> deleteEmp(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}

	@Override
	public List<Employee> paging(int pageNo, int size) {
		   Pageable p =PageRequest.of(pageNo, size);
		return repository.findAll(p).getContent();
	}

	
	

}
