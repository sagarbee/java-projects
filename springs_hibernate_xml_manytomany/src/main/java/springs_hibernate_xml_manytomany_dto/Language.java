package springs_hibernate_xml_manytomany_dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Language {
	
	@Id
	@Column(name="lId")
	private int id;
	private String name;
	private String origin;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name="lId"),inverseJoinColumns = @JoinColumn(name="pId"))
	List<Person> person;

}
