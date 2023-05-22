package com.homeloan.main.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailSender {
	
	private String to;
	private String from;
	private String subject;
	private String massege;
}
