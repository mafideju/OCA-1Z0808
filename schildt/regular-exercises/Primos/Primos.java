class Primos {
	
	public static void main(String[] args) {
		
		int count = 4;
		
		System.out.println("Primo 1: 2");
		System.out.println("Primo 2: 3");
		System.out.println("Primo 3: 5");
		System.out.println("Primo 4: 7"); 

		for (int i = 2; i < 10000; i++) {
			if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0) && !(i % 7 == 0)) {
	
				if ((i % 1 == 0) && (i % i == 0)) {
					++count;
					System.out.println("Primo " + count  + ": " + i);
				}		

			}
	
		}

	}

}
