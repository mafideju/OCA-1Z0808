import bookpack.Book;

class Main {
	public static void main(String... args) {
		Book books[] = new Book[7];
		
		books[0] = new Book("Java para Iniciantes", "Schildt", 2014);
		books[1] = new Book("Eloquent JavaScript", "Haversbeck", 2018);
		books[2] = new Book("Seara Vermelha", "Amado", 1951);
		books[3] = new Book("O Processo", "Kafka", 1925);
		books[4] = new Book("Os Irmãos Karamazov", "Dostoievsky", 1935);
		books[5] = new Book("Anna Karienina", "Tolstoi", 1940);
		books[6] = new Book("Jardins do Eden", "Hemmingway", 1960);

		for(int i = 0; i < books.length; i++) {
			books[i].print();
		}
		
	}
}
