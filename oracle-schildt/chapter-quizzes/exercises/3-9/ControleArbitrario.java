class ControleArbitrario {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 550000; i = i + i) {
			count++;
			System.out.println(count + "\t" + i);
		}
	}
}
