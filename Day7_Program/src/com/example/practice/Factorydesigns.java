package com.example.practice;


interface Payment {
 void pay(double ammout);
}


class CreaditCard implements Payment{

	@Override
	public void pay(double ammout) {
		// TODO Auto-generated method stub
		System.out.println("Payment done by Creadit Card: ");
		
	}
}

class UPI implements Payment{

	@Override
	public void pay(double ammout) {
		// TODO Auto-generated method stub
		System.out.println("Payment done by UPI: ");
	}
	
}

class PaymentFactory{
	public static Payment getPayment(String type) {
		
		return switch(type) {
		
		case "creadit" -> new CreaditCard();
		case "upi" -> new UPI();
		default -> throw new IllegalArgumentException("Unexpected value: " + type);
		};
	}
}

public class Factorydesigns{
	public static void main(String[] args) {
		
		Payment p1 = PaymentFactory.getPayment("creadit");
		p1.pay(2000);
		
		Payment p2 = PaymentFactory.getPayment("upi");
		p2.pay(3999);
		
		
		
	}
}

