package springs_hibernate_xml_manytomany_dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@Column(name="pId")
	private int id;
	private String name;
	private long phone;
	private String address;

	@ManyToMany(mappedBy = "person")
	List<Language> languages;
}
