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
public class GuarantorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guarantorId;
	private String guarantorName;
	private String guarantorAddress;
	private String guarantorContact;
	private String guarantoradharNumber;
	private String guarantorpanNumber;

}