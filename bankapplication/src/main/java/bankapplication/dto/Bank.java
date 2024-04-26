package bankapplication.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="BankName")
	private String name;
	@Column(name="BankHolderName")
	private String userName;
	@Column(name="AccountNumber")
	private long accountNo;
	private String address;
	private double initalBalence;
	private double balance;
	
	static double minbal=3000.0;
}
