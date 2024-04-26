package springs_xml;

public class Mobile {

	private String company;
	private double price;
	Sim sim;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public Sim getSim()
	{
		return sim;
	}

	public void info() {
		System.out.println("Mobile [company=" + company + ", price=" + price + "]");
	}

	public void used() {
		sim.serviceProvider();
	}
}
