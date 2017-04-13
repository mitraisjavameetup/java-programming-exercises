package com.mitrais.cdc.java;


import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.mitrais.cdc.java.FileIoExamples;

public class FileIoExamplesTest {
	
	String inputFile = "enable1-word-list.txt";
	
	@Test
	public void nLetterWord() throws Exception {
		assertEquals(FileIoExamples.nLetterWord(inputFile, 10), "aardwolves");
	}
	
	@Test
	public void abcWord() throws Exception{	
		assertEquals(FileIoExamples.abcWord(inputFile), "abacuses");
	}
	
	@Test
	public void abcWordMixedCase() throws Exception{
		assertEquals(FileIoExamples.abcWordMixedCase(inputFile), "abacuses");
	}
	
	@Test
	public void longestWordWithout() throws Exception{	
		assertEquals(FileIoExamples.longestWordWithout(inputFile, "a", "e"), "psychophysiologists");
	}
	
	@Test
	public void shortestWordWith() throws Exception{	
		assertEquals(FileIoExamples.shortestWordWith(inputFile, "q"), "qat");
	}
	
	@Test
	public void storeTwitterList() throws Exception{
		String outputFile = "twitter-words.txt";
		FileIoExamples.storeTwitterList(inputFile, outputFile);
		assertNotNull(Paths.get(outputFile));
		
		List<String> result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
		assertEquals(result.get(0), "BOWWOW!");
		assertEquals(result.get(1), "BOWWOWED!");
		assertEquals(result.get(2), "BOWWOWING!");
		assertEquals(result.get(61), "WOWSERS!");
		assertEquals(result.size(), 62);
	}
	
	@Test
	public void numPathsInProject() throws Exception{
		assertTrue( FileIoExamples.numPathsInProject() > 0);
	}
	
	@Test
	public void storeNums() throws Exception{
		String outputFile = "random-nums.txt";
		int n = 17;
		FileIoExamples.storeNums(n, 100, outputFile);
		
		assertNotNull(Paths.get(outputFile));
		List<String> result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
		assertEquals(result.size(), n);
	}	
}
