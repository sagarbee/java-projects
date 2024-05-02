package employeeBankAccount;

import org.springframework.context.annotation.Primary;

@Primary
public class HDFC implements BankAccount{

	
	public void checkBalance() {
		// TODO Auto-generated method stub
	System.out.println("Balance is 50000");	
	}
	
}
