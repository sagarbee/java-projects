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

	
	
}
