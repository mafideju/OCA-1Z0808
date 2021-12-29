package E_oop.heranca.desafios;

public class Ferrari extends Carro {
	
	Ferrari() {
		super(80);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	void acelerar() {
		super.acelerar();
		velocidade += 5;
	}
}
