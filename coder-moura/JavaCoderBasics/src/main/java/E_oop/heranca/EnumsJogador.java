package E_oop.heranca;

public class EnumsJogador {

	int x;
	int y;
	
	boolean andar(Direcao direcao) {
		switch(direcao) {
		case NORTE:
			y++;
			break;
		case SUL:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
