package com.nit.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.common.Employee;
@Repository("empDAO")
public class EmployeeDao implements IEmployee {
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getByData(String degn1, String degn2, String degn3)throws Exception {
		List<Employee> listEmp=null;
		try(Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT * FROM EMP WHERE JOB IN(?,?,?)ORDER BY JOB");){
		ps.setString(1,degn1);
		ps.setString(2, degn2);
		ps.setString(3, degn3);
		
		try(ResultSet rs=ps.executeQuery();){
		 listEmp=new ArrayList();
		while(rs.next()) {
			Employee e=new Employee();
			e.setEno(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setDegn(rs.getString(3));
			e.setSalery(rs.getFloat(4));
			
			listEmp.add(e);
			
		}
		}//try2
		}//try1
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
			
		
		
		
		return listEmp;
	}

	
}
