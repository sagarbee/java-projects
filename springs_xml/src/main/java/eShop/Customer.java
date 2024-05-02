package eShop;

public class Customer {


	private int id;
	private String name;

	
	public int getId() {
		return id;
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

	private void goToMarket() {
		System.out.println("Go to D-Mart");
	}
	
	public void buy()
	{
		System.out.println("Done");
	}
	
	public void stop() {
		System.out.println("Go Back Home");
	}
	
}
