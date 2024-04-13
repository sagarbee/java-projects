package hibernate_user.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user_info")
@Getter
@Setter
public class User {
	@Id
	private int id;
	@Column(name="user_name")
	private String name;
	@Column(unique=true)
	private long phone;
	@Column(unique=true)
	private String email;
	private String password;
	private String facebook;
	private String instagram;
	private String x;
	private String snapchat;
	
}
