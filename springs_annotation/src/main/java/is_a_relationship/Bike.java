package is_a_relationship;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Item{

	@Override
	public void used() {

		System.out.println("Bike is used as a means of transport");
	}
}
