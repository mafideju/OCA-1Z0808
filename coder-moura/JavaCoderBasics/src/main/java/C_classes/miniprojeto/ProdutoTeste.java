package C_classes.miniprojeto;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto blusa = new Produto("Blusa Moleton");
		Produto calca = new Produto("Calça Sarja");
		
		blusa.preco = 199.99;
		
		calca.preco = 149.99;
		
		double custoBlusa = blusa.precoComDesconto();
		double custoCalca = calca.precoComDesconto();
		
		
		System.out.printf("Blusa Moleton!!! De %.2f por %.2f !!!", blusa.preco, custoBlusa);
		System.out.println();
		System.out.printf("Calca Sarja!!!!! De %.2f por %.2f !!!", calca.preco, custoCalca);
	}

}
