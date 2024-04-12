package hibernate_person;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="person_info")
@Getter
@Setter
@ToString
public class Person {

	@Id
	private int id;
	private String name;
	private long phone;
	private String email;
	
	
}
