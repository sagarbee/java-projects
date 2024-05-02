package springs_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Product {

	
	private String name;
	
	@Value("4580.45")
	private double price;
	
	
	
	public String getName() {
		return name;
	}


	@Value("Engine Oil")
	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}

	public void description() {
		System.out.println("product usage!!!!!");
	}
}
