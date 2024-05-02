package is_a_relationship;

import org.springframework.stereotype.Component;

@Component
public class Computer implements Item{

	@Override
	public void used() {
		System.out.println("Computer is used for coding");
	}
}
