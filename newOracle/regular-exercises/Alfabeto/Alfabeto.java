class Alfabeto {
	public static void main(String[] args) {
		char ch;
		int count;

		ch = 'A';
		count = 1;

		System.out.println("Posição\tLetra");
		
		while(ch <= 'Z') {
			System.out.println(count + "\t" + ch);
			ch++;
			count++;
		}
	}
}
