package manytomany_bi_dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	private int id;
	private String name;
	private long phone;
	private String address;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "sid"), inverseJoinColumns = @JoinColumn(name="cid"))
	List<Course>course;
	
}
