package E_oop.desafios;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Marcio Mafideju");
		Compra compra1 = new Compra();
		compra1.addItem("Caneta", 2.69, 100);
		compra1.addItem(new Produto("Caderno", 4.99), 100);
		
		Compra compra2 = new Compra();
		compra2.addItem("Televisão", 2009.69, 1);
		compra2.addItem(new Produto("Cadeira", 499.99), 5);
		
		System.out.println("O cliente " + cliente.nome + " gastou " + Math.round((compra1.getValorTotal() + compra2.getValorTotal()))  + " reais.");
		
	}

}
