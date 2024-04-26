package onetoone_uni_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	private int id;
	private String name;
	private long phone;
	private String address;
	/*
	 * Cascading always use for one to one and one to many
	 */
	
//	@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@OneToOne(cascade = CascadeType.ALL)
	AdharCard adharCard;

}
