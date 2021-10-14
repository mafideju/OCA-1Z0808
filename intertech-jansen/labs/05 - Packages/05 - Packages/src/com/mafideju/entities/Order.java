package com.mafideju.entities;
import com.mafideju.helpers.MyDate;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	
	public static double taxRate = 0.05;
	
	public Order(MyDate orderDate, double orderAmount, String customer, String product, int quantity){
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}
	
	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}
	
	public static void computeTaxOn(double anAmount){
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}
	
	public double computeTax() {
		System.out.println("The tax for this order is: " + this.orderAmount * Order.taxRate);
		return this.orderAmount * Order.taxRate;
	}
	
	public String toString(){
		return this.quantity + " of " + this.product + " for " + this.customer; 
	}
}
