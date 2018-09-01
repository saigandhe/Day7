package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.files.WordCount;

class WordCountTest {

	@Test
	void test() {
		assertEquals(5, WordCount.countNumberOfWords("C:\\Naina\\naveena.txt"));
	}

}
