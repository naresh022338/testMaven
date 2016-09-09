package com.psl.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="emp")  // bean id
public class Employee {
	
	@Value(value="1")
	private int id;
	@Value(value="naresh")
	private String name;
	
	/*@Autowired
	private Address addr;*/
	
	public Employee(){
		System.out.println("in default constructor of Employee");
	}
	
	/*public Employee(int id, String name, Address addr) {
		System.out.println("in param constructor of Employee");
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
*/
	public Employee(int id, String name) {
		System.out.println("in param constructor of Employee");
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		System.out.println("in setId");
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		System.out.println("in setName");
		this.name = name;
	}



	/*public Address getAddr() {
		return addr;
	}



	public void setAddr(Address addr) {
		System.out.println("in setAddr");
		this.addr = addr;
	}
*/
	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}*/
	
	

}
