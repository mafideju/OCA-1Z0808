package com.mafideju.general;

import com.mafideju.general.Good.UnitOfMeasureType;
// import com.mafideju.general.*;

public class TestGoods {

	public static void main(String[] args) {
		Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER, false, 15, 6);
		Liquid paint = new Liquid("Acme Invisible Paint", 2490, 0.65, UnitOfMeasureType.GALLON, true, 0.70, 12);
		Solid anvil = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, false, 5000, 0.5, 0.5);
		// Good g = new Good("Acme Earthquake Pills", 1304, 0.15, UnitOfMeasureType.CUBIC_FEET, false, 1);
		
		System.out.println(glue);
		System.out.println(paint);
		System.out.println(anvil);
		
		System.out.println("****************************************************");
		System.out.println("The weight of " + glue + " is " + glue.weight());
		System.out.println("The weight of " + paint + " is " + paint.weight());
		System.out.println("The weight of " + anvil + " is " + anvil.weight());

		System.out.println("****************************************************");
		Good x = glue;
		System.out.println("Is " + x + " Is flammable?  " + x.isFlammable());
		// System.out.printf("%s pega fogo? - %s", x, x.isFlammable());
		x = paint;
		System.out.printf("\n%s pega fogo? - %s", x, x.isFlammable());
		x = anvil;
		System.out.printf("\n%s pega fogo? - %s", x, x.isFlammable());
	}
}