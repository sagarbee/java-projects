package engineer;

import org.springframework.stereotype.Component;

@Component
public class Mechcanical implements College{

//	to store its object and its subtypes is called as generailzation
	
	@Override
	public void study() {
		System.out.println("mechanical is studied");
	}
}
