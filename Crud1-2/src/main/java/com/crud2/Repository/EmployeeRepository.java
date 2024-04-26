package com.crud2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	public List<Employee> findByUsernameAndPassword(String username,String password);

}
