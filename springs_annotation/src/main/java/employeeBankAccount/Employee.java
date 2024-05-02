package employeeBankAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("Sagar More")
	private String name;
	@Value("9856478954")
	private long phone;
	@Value("Pune, Maharashtra")
	private String address;
	
	@Autowired
	@Qualifier("SBI")
	BankAccount account;
	
	public void check() {
		
		account.checkBalance();
		
	}
	
}
