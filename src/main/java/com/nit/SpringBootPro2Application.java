package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.common.Employee;
import com.nit.controller.EmployeeController;

@SpringBootApplication
public class SpringBootPro2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootPro2Application.class, args);
		EmployeeController ec=ctx.getBean("empController", EmployeeController.class);
		try {
		List<Employee> listname=ec.getController("manager","cleark","account");
		listname.forEach(emp->System.out.println(emp));
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
