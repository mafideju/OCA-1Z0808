package E_oop.heranca;

public class EnumTest {

	public static void main(String[] args) {
		EnumsJogador one = new EnumsJogador();
		one.andar(Direcao.NORTE);
		one.andar(Direcao.OESTE);
		System.out.println(one.y);
		System.out.println(one.x);
	}

}
// CARRO extends , ESTANCIAR DOIS VEICULOS (FERRARI, CIVIC)
// ACELERAR(sobrescreve na ferrari), FREIAR (INT VELOCIDADE = 0)
// 
