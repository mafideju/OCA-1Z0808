class BuscaSimples {
	public static void main(String... args) {
		int argo = 0;
		int[] database = { 6, 8, 3, 7, 5, 6, 1, 4 };
		boolean found = false;
		
		for(int i = 0; i < args.length; i++) {
			try {
				argo = Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.out.println("Number Format Exception. Caractere " + args[i] + " não permitido.");
				return;
			}
		}

		for(int item : database) {
			if(item == argo){
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Valor " + argo + " encontrado!");
		} else {
			System.out.println("Valor " + argo + " NÃO encontrado!");
		}
	}
}
