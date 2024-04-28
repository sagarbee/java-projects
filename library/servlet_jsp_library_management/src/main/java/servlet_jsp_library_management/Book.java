package servlet_jsp_library_management;

public class Book {

	private int id;
	private String name, genre, author;
	private double price;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public Book(int id, String name, String genre, String author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.author = author;
		this.price = price;
	}
	public Book(String name, String genre, String author, double price) {
		super();
		this.name = name;
		this.genre = genre;
		this.author = author;
		this.price = price;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenere() {
		return genre;
	}

	public void setGenere(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
