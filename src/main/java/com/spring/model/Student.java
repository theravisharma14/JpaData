package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roll_no;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="pincode")
	private String pincode;

	

}
