package A_fundamentos.basics1;

public class Basics1 {
	
	public static void main(String[] args) {
		double C;
		double F;
		final double formulaConstant = 32.0;
		final double conversionRate = 5.0/9.0;

		F = 100;
		C = (F - formulaConstant) * conversionRate;
		System.out.printf("%.1f°C equivalem a %s°F \n", C, F);
		
		F = 86;
		C = (F - formulaConstant) * conversionRate;
		System.out.println(C + "°C equivalem a " + F + "°F");
	}
	
}
