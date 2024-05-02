package springs_annotation_mapping_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value("Sagar More")
	private String name;
	@Value("9874563212")
	private long phone;
		
	@Autowired
	@OneToOne(cascade = CascadeType.ALL)
	SalaryAccount salary;
	
}
