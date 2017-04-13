package com.mitrais.finaltest.java;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.mitrais.finaltest.java.PasswordChecker;

public class PasswordCheckerTest {
		
	@Test
	public void similarPassword() throws Exception {
		String inputFile = "password-list.txt";
		String outputFile;
		List<String> result;
		
		PasswordChecker.similarPassword(inputFile, "pass");
		outputFile = "password-similar-to-pass.txt";
		result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
		assertNotNull(result);
		assertEquals(result.size(), 27);
		assertEquals(result.get(0), "password");
		assertEquals(result.get(5), "freepass");
		assertEquals(result.get(10), "megapass");
		assertEquals(result.get(26), "password2");
	}
}
