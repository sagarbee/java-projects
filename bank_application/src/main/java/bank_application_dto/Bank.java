package bank_application_dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Bank {
	@Id
	private long accountNumber;	
	private String name;
	private String accountHolder;
	private String address;
	private double balance;
	
	
}
