package engineer;

import org.springframework.stereotype.Component;

@Component
public class Civil implements College{

	@Override
	public void study() {
		System.out.println("studying Civil ");
	}
}
