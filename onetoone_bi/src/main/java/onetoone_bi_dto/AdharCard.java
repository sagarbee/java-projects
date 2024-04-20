package onetoone_bi_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class AdharCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long a_id;
	private String name;
	private String address;
	@OneToOne
	Person person;
	
}