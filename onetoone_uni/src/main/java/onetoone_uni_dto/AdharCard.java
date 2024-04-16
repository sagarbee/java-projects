package onetoone_uni_dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AdharCard {
	
	@Id
	private long a_id;
	private String name;
	private String address;
	
	
}