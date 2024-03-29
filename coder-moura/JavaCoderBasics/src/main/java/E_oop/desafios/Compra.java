package E_oop.desafios;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	int id;
	final List<Item> itemsCompra = new ArrayList<Item>();

	void addItem(Produto prod, int qtd) {
		this.itemsCompra.add(new Item(prod, qtd));
	}
	
	void addItem(String nome, double preco, int qtd) {
		Produto produto = new Produto(nome, preco);
		this.itemsCompra.add(new Item(produto, qtd));
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Item item: itemsCompra) {
			total = total + (item.quantidade * item.produto.preco);
		}
		
		return total;
	}
}
