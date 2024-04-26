package springs_xml;

public class Car {

	String manufacture;
	double cost;
	Engine eng;
	
	
	
	public Car(String manufacture, double cost, Engine eng) {
		this.manufacture = manufacture;
		this.cost = cost;
		this.eng = eng;
	}



	public void info() {
		System.out.println("Car [manufacture=" + manufacture + ", cost=" + cost  +"]");
		eng.horsePower();
	}
}
