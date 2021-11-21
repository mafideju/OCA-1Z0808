package com.mafideju.general;

import com.mafideju.general.Good.UnitOfMeasureType;

public class TestOrders {
	
	public static void main(String[] args) {
		MyDate date1 = new MyDate(1, 20, 2008);
		
		Solid s1 = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, false, 500, 0.25, 0.3);
		Order anvil = new Order(date1, 2000.00, "Wile E Coyote", s1, 10);
		MyDate date2 = new MyDate(4, 10, 2008);
		Solid s2 = new Solid("Acme Balloon", 1401, 15, UnitOfMeasureType.CUBIC_FEET, false, 10, 5, 5);
		Order balloons = new Order(date2, 1000.00, "Bugs Bunny", s2, 125);
		balloons.setQuantity(-200);
		System.out.println(anvil);
		System.out.println(balloons);
		System.out.println("The tax Rate is currently: " + Order.taxRate);
		Order.computeTaxOn(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		Order.setTaxRate(0.06);
		System.out.println("The tax Rate is currently: " + Order.taxRate);
		Order.computeTaxOn(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		System.out.println("The total bill for: " + anvil + " is " + anvil.computeTotal());
		System.out.println("The total bill for: " + balloons + " is " + balloons.computeTotal());
		System.out.println("**************************************");
		
		MyDate date3 = new MyDate(4,10,2008);
		Service s3 = new Service("Road Runner Eradication", 14, false);
		Service s4 = new Service("Teste de Aplicação", 66, true);
		Order birdEradication = new Order(date3, 20000, "Daffy Duck", s3, 1);
		Order orderTest = new Order(date3, 20000, "Pato Maluco de Teste", s4, 1);
		System.out.println("The total bill for: " + birdEradication + " is "+ birdEradication.computeTotal());
		
		System.out.println("The total bill for: " + orderTest + " is "+ orderTest.computeTotal());
		
		
	}
}
