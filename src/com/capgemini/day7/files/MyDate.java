package com.capgemini.day7.files;

import java.io.Serializable;
import java.time.LocalDate;

public class MyDate implements Serializable {
	 
	
	private static final long serialVersionUID = 1L;
	private LocalDate date;


	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public MyDate(LocalDate date) {
		super();
		this.date = date;
	}



	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}
	
	
	

}
