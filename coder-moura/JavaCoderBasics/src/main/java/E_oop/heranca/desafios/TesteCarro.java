package E_oop.heranca.desafios;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro beseta = new Ferrari();
		Carro honda = new Civic();
		
		Carro marinara = new Ferrari(30);
		Carro topic = new Civic(10);
		
		honda.acelerar();
		honda.acelerar();
		honda.acelerar();
		honda.acelerar();
		honda.acelerar();
		beseta.acelerar();
		beseta.acelerar();
		System.out.println("Honda A: " + honda.velocidade);
		System.out.println("Beseta A: " + beseta.velocidade);
		
		marinara.acelerar();
		marinara.acelerar();
		marinara.acelerar();
		marinara.acelerar();		
		marinara.acelerar();
		marinara.acelerar();
		marinara.acelerar();
		topic.acelerar();
		topic.acelerar();
		topic.acelerar();
		System.out.println("Marinara A: " + marinara.velocidade);
		System.out.println("Topic A: " + topic.velocidade);

		honda.frear();
		beseta.frear();
		beseta.frear();
		beseta.frear();

		System.out.println("Honda B: " + honda.velocidade);
		System.out.println("Beseta B: " + beseta.velocidade);
		
		honda.frear();
		beseta.frear();
		beseta.frear();
		beseta.frear();
		
		System.out.println("Honda C: " + honda.velocidade);
		System.out.println("Beseta C: " + beseta.velocidade);
	}
}
