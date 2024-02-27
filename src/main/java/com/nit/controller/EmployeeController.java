package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.common.Employee;
import com.nit.service.ImployeeService;

@Controller("empController")
public class EmployeeController {
	@Autowired
	private ImployeeService i;
	
	public List<Employee> getController(String degn1,String degn2,String degn3)throws Exception{
		List<Employee> list1=i.fetchEmplByDegn(degn1,degn2,degn3);
		return list1;
		
	}
	

}
