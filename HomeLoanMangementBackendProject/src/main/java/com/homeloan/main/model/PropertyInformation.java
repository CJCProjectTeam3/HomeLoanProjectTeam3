package com.homeloan.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PropertyInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int propertyId;
	private String propertyType;
	private String propertyArea;
	private String constructionArea;
	private double propertyPrice;
	private double constructionPrice;
	private byte[] propertyDocuments;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PropertyAddress propertyAddress;


}
