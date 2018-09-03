package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.files.Assignment;

class AssignmentTest {

	@Test
	void test() {
		Assignment a1 =new Assignment("C",LocalDate.of(2012, 06, 15));
		Assignment a2 =new Assignment("java",LocalDate.of(2018, 07, 16));
		Assignment a3 =new Assignment("oracle",LocalDate.of(2016, 06, 12));
		Assignment a4 =new Assignment("dsp",LocalDate.of(2018, 10, 25));
	
	assertEquals(true,Assignment.adding(a1));
	assertEquals(true,Assignment.adding(a2));
	assertEquals(true,Assignment.adding(a3));
	assertEquals(true,Assignment.adding(a4));
	

	assertEquals(true,Assignment.remove(a4));
	
	Assignment.show();
		System.out.println("\n");
		
	assertEquals(a1,Assignment.search());	
 }


}
