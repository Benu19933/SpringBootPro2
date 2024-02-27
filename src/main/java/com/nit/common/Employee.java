package com.nit.common;

import lombok.Data;

@Data
public class Employee {
	private Integer eno;
	private String name;
	private String degn;
	private Float salery;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegn() {
		return degn;
	}
	public void setDegn(String degn) {
		this.degn = degn;
	}
	public Float getSalery() {
		return salery;
	}
	public void setSalery(Float salery) {
		this.salery = salery;
	}
	
	
	

}
