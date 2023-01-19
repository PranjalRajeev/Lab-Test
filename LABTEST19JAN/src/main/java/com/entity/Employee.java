package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private int e_id;
	private String f_name;
	private String l_name;

	@ManyToMany
	public Project Project;

}
