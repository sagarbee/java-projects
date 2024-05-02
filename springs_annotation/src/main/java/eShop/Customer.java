package eShop;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	@PostConstruct
	private void goToMarket() {
		System.out.println("Go to D-Mart");
	}
	
	public void buy()
	{
		System.out.println("Done");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("Go Back Home");
	}
	
}
