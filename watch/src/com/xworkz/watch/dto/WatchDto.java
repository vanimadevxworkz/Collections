package com.xworkz.watch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WatchDto {
	
	private String name;
	private String companyName;
	private int price;
	private boolean payment;
	private int numOfBrand;
	private char size;

}
