package springs_hibernate_xml_dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pancard {

	@Id
	int id;
	String name;
	String address;
	
}
