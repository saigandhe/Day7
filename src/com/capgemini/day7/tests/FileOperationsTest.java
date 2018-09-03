package com.capgemini.day7.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.files.FileOperations;

class FileOperationsTest {

	@Test
	void testReverse() {
		assertEquals(true, FileOperations.reverse("C:\\Users\\saigandh\\Documents\\Samples.txt", "C:\\Users\\saigandh\\Documents\\ReverseOutput.txt"));
		assertEquals(true, FileOperations.convert("C:\\Users\\saigandh\\Documents\\Samples.txt", "C:\\Users\\saigandh\\Documents\\ConvertOutput.txt"));
		assertEquals(true, FileOperations.compare("C:\\Users\\saigandh\\Documents\\Samples.txt", "C:\\Users\\saigandh\\Documents\\TestFile.txt"));
	}
}
