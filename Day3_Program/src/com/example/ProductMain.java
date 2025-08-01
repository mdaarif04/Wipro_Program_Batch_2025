package com.example;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Through the ProductBuilder Class we are making Product class as Mutable
		Product p = new Product.ProductBuilder()
				.setName("Mouse")
				.setPrice(450.00)
				.build();
		p.show();		

	}	

}
