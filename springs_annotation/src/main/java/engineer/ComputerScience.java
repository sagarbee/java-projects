package engineer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ComputerScience implements College{

	public void study() {
		System.out.println("Computer Scienece is studied");
	}
}
