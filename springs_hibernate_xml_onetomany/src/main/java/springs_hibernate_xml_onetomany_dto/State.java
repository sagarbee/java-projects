package springs_hibernate_xml_onetomany_dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class State {

	@Id
	private int id;
	private String name;
	private String capital;
	private String cm;
}
