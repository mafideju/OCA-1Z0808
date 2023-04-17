class Polegadas {
        public static void main(String[] args) {
                double metro, polegada;
		int counter = 0;

		for (polegada = 1; polegada <= 144; polegada++) {
			
			metro = polegada / 39.37;

			System.out.println(polegada + " pelegadas equivalem a " + metro + " metros.");	

			counter++;

			if (counter == 12) { System.out.println(); counter = 0; }

		}
	}
}


