package com.homeloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmailSender {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String to;
	private String from;
	private String subject;
	private String massege;
}
