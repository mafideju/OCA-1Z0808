package A_fundamentos.basics4;

public class Basics4 {
	public static void main(String[] args) {
		double numerandoA = 6 * (3 + 2);
		double numerandoB = (1 - 5) * (2 - 7);
		double dividendoA = 3 * 2;
		double dividendoB = 2;
		
		numerandoA = Math.pow(numerandoA, 2);
		
		double expressaoA = numerandoA / dividendoA;
		double expressaoB = numerandoB / dividendoB;
		
		expressaoB = Math.pow(expressaoB, 2);

		double formulaSuperior = expressaoA - expressaoB;
		
		formulaSuperior = Math.pow(formulaSuperior, 3);
		
		double formulaInferior = Math.pow(10, 3);
		double finalResult = formulaSuperior / formulaInferior;
		
		System.out.println("Num. A: " + numerandoA);
		System.out.println("Num. B: " + numerandoB);
		System.out.println("Div. A: " + dividendoA);
		System.out.println("Div. B: " + dividendoB);
		System.out.println("Exp. A: " + expressaoA);
		System.out.println("Exp. B: " + expressaoB);
		System.out.printf("A parte de cima é de %s e a de baixo é %s.", formulaSuperior, formulaInferior);
		System.out.println("Resultado: " + finalResult);
	}
}
