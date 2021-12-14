package E_oop.desafios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> listaCompras = new ArrayList<Compra>();
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	double getValorTotal() {
		double total = 0;
			
		for (Compra compra: listaCompras) {
			total = total + compra.getValorTotal();
		}
		
		return total;
	}
}
