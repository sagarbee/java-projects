package springs_hibernate_xml_onetomany_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Country {

	@Id
	private int id;
	private String name;
	private String capital;
	private String pm;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<State> state;
}
