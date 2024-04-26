package manytomany_bi_dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cid")
	private int id;
	private String name;
	private double fees;
	private double duration;
	@ManyToMany(mappedBy = "course")
	List<Student>student;
}
