package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="thought")
@Data
public class Thought {

	@Id
	private int id;
	private String title;
	
	@Column(length = 1500)
	private String content;
	private Date addedDate;
	
	public Thought() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thought(String title, String content, Date addedDate) {
		super();
		this.id = new Random().nextInt(10000);
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}

	
}
