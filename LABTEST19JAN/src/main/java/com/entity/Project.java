package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Project {
	@Id
	private int p_id;
	@Column(unique = true)
	private String p_name;

}
