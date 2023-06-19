package com.shankar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private int cid;
	private String cname;
	private String cadd;
	private Float billAmt;

}
