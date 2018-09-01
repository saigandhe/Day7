package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.files.Grep;

class GrepTest {

	
		@Test
		void testGrepApp() {
			File file=new File("C:\\Naina\\naveena.txt");
			assertEquals(true,Grep.stringSearch(file,"in"));

		}

	
	}


