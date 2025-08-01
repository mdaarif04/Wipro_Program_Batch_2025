package com.example;



class Person
{
	
int id;
String name;

public Person(int id, String name) {
	
	this.id = id;
	this.name = name;
}

public Person()
{
	
	this(101 , "Niti");   // constructor chaining

}

public void display()
{
	
	System.out.println("ID :" + this.id + "Name :" + this.name );
}

}

public class ThisKeyWordsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		p.display();

	}

}
