package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistanceTest {

	@Test

	
		void testExistenceOfFile() {
			File file = new File("C:\\Naina\\naveena.txt");
			assertEquals(true, file.exists());
			assertEquals(true, file.isFile());
		
	}

}
