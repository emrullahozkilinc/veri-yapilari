package com.emr.data_structers.linkedlists.node;

import lombok.Data;

@Data
public class Customer {
	
	int id;
	String name;
	String lastname;
	Customer sonraki;

}
