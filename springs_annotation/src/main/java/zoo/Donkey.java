package zoo;

import org.springframework.context.annotation.Primary;

@Primary
public class Donkey implements Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("DhochakDhochak...");
	}

}
