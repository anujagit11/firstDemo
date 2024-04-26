package com.crud2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud2.model.Employee;
import com.crud2.serviceI.EmpServiceI;

@Controller
public class HomeController {
    
	@Autowired
	EmpServiceI si;
	
	@RequestMapping("/")
	public String home()
	{
		return "login";
	}
	
	@RequestMapping("/reg")
	public String reg()
	{
		return "register";
	}
	@RequestMapping("/save")
	public String register(@ModelAttribute Employee e)
	{
		si.saveEmp(e);
		return"login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password,Model m)
	{
		List<Employee> list=si.getData(username,password);
		if(!list.isEmpty())
		{
			m.addAttribute("data", list);
			return "success";
		}
		else
		{
			m.addAttribute("msg", list);
			return "success";
		}
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam int id,Model m)
	{
		Employee e=si.editemp(id);
		m.addAttribute("stu", e);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Employee e,Model m)
	{
		List<Employee> list=(List<Employee>) si.updateEmp(e);
		m.addAttribute("data", list);
		return "success";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam int id,Model m)
	{
	List<Employee>	list=si.deleteEmp(id);
	m.addAttribute("data", list);
	return "success";
	}
	
	@RequestMapping("/paging")
	public String paging(@RequestParam int pageNo,Model m)
	{
		List<Employee> list=si.paging(pageNo,2);
	    m.addAttribute("data",list);
	    return "success";
	}
}
