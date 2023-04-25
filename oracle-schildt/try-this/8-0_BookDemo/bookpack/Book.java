package bookpack;

public class Book {
	private String title;
	private String author;
	private int publishDate;

	public Book(String title, String author, int publishDate) {
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
	}

	public void print() {
		System.out.println("O livro \"" + this.title + "\" do " + this.author + " foi publicado em " + publishDate + ".");
	}
}
