package springs_hibernate_xml_dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	int id;
	String name;
	@Column(unique = true)
	long phone;
	String address;
	@OneToOne(cascade = CascadeType.ALL)
	Pancard pan;

	public Person(int id, String name, long phone, String address, Pancard pan) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.pan = pan;
	}
	
}
