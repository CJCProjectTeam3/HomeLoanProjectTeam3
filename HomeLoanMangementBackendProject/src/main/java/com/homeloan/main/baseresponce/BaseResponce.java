package com.homeloan.main.baseresponce;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseResponce<T> {

	private int statusCode;
	private Date date;
	private String msg;
	private T body;
	
}
