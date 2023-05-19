package com.homeloan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Occupation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int occupationId;
	private String occupationType;
	private double annualIncome;

}
