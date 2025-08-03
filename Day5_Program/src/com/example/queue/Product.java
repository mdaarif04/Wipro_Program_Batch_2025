package com.example.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Comparable is for natural ordering 
class Product implements Comparable<Product>
{
	String name ;
	double price ;
	double rating ;
	public Product(String name, double price, double rating) {
		super();
		this.name = name;
		this.price = price;   
		this.rating = rating;
	}
	
	
	
	// If we want to do the natural ordering by price
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return Double.compare(this.rating , o.rating); // Collections.sort(list) -- internally it is calling compareTo method o each pair of object it return -1(less than) , 0(equal) , 1  (positive is greater)
	}

	// To string method is used to display the info of an object
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", rating=" + rating + "]";
	}
	

}



