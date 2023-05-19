package com.homeloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PersonalDocuments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int documentId;

	private byte[] panImage;
	
	private byte[] adharImage;
	private byte[] photograph;
	private byte[] signImgae;
	private byte[] itrcopy;
	private byte[] salarySlip;

}
