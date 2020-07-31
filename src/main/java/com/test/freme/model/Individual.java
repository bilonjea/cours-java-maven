package com.test.freme.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Individual {
	/******* VARIABLES *******/
	
	private String lastName;
	private String firstName;
	private int age;
	private String address;
	
	/******* METHODS *******/

	
}
