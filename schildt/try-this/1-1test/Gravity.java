class Gravity {
	public static void main(String[] args) {

		double peso, gravidade, pesoNaLua, taxaGravitacional;

		peso = 80;
		gravidade = 0.17;

		System.out.println("gravidade " + gravidade);
		taxaGravitacional = peso * gravidade;

		System.out.println("taxa " + taxaGravitacional);

		pesoNaLua = peso - taxaGravitacional;

		System.out.println("Se você pesa " + peso + " na Terra, então na Lua você vai pesar " + taxaGravitacional + " quilos.");

 	}
}

