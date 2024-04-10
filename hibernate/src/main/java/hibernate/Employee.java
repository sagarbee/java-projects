package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Employee {

	@Id
	private int id;
	private String name;
	private long phno;
	private String address;
	
	
}
