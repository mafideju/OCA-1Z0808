package com.mafideju.entities;
import com.mafideju.helpers.MyDate;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	
	public static double taxRate = 0.05;
	// public char size;
	
	public Order(MyDate orderDate, double orderAmount, String customer, String product, int quantity){
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}
	
	public char jobSize() {
		if (this.orderAmount <= 25) {
			return 'S';
		} else if (this.orderAmount > 25 && this.orderAmount <= 75) {
			return 'M';
		} else if (this.orderAmount > 75 && this.orderAmount <= 150) {
			return 'L';
		} else {
			return 'X';
		}
	}
	
	public double computeTotal() {
		switch ( jobSize() ) {
			case 'M':
				this.orderAmount = this.orderAmount - (this.orderAmount * 0.01);
				break;
			case 'L':
				this.orderAmount = this.orderAmount - (this.orderAmount * 0.02);
				break;
			case 'X':
				this.orderAmount = this.orderAmount - (this.orderAmount * 0.03);
				break;
		}
		if (this.orderAmount <= 1500) {
			this.orderAmount = this.orderAmount + this.computeTax();
		}
		return this.orderAmount;
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
