package hibernate_student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student_info")
@Getter
@Setter
@ToString
public class Student {

	@Id
	private int id;
	@Column(name = "std_name")
	private String name;
	private double marks;
	@Column(unique = true)
	private double phone;
	private String address;	
}
