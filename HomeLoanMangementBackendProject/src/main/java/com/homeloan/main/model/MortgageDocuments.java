package com.homeloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MortgageDocuments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mortgageId;
	private double mortgagePropertyValue ;
//	@Lob
	private byte[] mortgagePropertyProof;
	private String mortgagePropertyType;
	

}
