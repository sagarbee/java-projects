package springs_annotation_mapping_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class SalaryAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value("HDFC")
	private String name;
	@Value("hdfc0wadcam")
	private String ifsc;
	
}
