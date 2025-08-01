package com.collection;

public class Employe {
	 private int id;
	 private String name;
	 private double Salary;


	 public Employe(int id, String name, double salary) {
	  super();
	  this.id = id;
	  this.name = name;
	  Salary = salary;
	 }


	 public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return Salary;
	}


	@Override
	 public String toString() {
	  return "Employeee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	 }
	 
	}
