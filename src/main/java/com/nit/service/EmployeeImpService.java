package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.bean.IEmployee;
import com.nit.common.Employee;
@Service("empService")
public class EmployeeImpService implements ImployeeService {
	@Autowired	
	IEmployee iemp;

	@Override
	public List<Employee> fetchEmplByDegn(String degn1, String degn2, String degn3)throws Exception {
		List<Employee> lis=iemp.getByData(degn1, degn2, degn3);
		return lis;
	}



}
