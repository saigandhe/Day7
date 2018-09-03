package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.files.ValidateDate;

class ValidateDateTest {

	
		@Test
		void test() {
			assertEquals(true, ValidateDate.valid("28/02/2012",2));
			assertEquals(true, ValidateDate.valid("29/02/2012",2));
			assertEquals(true, ValidateDate.valid("20/09/2015",2));
			assertEquals(false, ValidateDate.valid("29/02/2011",2));
		}


	}


