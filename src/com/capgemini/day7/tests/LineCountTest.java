package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.files.LineCount;

class LineCountTest {

	@Test
	void testLineCount() {
		//File file = new File("C:\\Naina\\naveena.txt");
		assertEquals(2, LineCount.countNumberOflines("C:\\Naina\\naveena.txt"));
	}

}
