package servlet_jsp_library_management;

public class Book {

	private int id;
	private String name, genere, author;
	private double price;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public Book(int id, String name, String genere, String author, double price) {
		super();
		this.id = id;
		this.name = name;
		this.genere = genere;
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
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
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
