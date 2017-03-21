package com.mitrais.cdc.java;

import static org.junit.Assert.*;
import org.junit.Test;
import com.mitrais.cdc.java.FileIOExamples;

public class FileIoExamplesTest {
	
	@Test
	public void print10LetterWord() throws Exception {
		
		assertEquals(FileIOExamples.print10LetterWord(FileIOExamples.testWords.stream()), "boo1234567");
		assertEquals(FileIOExamples.print10LetterWord(FileIOExamples.filename), "aardwolves");
	}
	
	@Test
	public void printNLetterWord() throws Exception {
		
		assertEquals(FileIOExamples.printNLetterWord(FileIOExamples.testWords.stream(), 11), "baz12345678");
		assertEquals(FileIOExamples.printNLetterWord(FileIOExamples.filename, 11), "abandonment");
		
		for (int wordLength = 2; wordLength < 6; wordLength++) {
			String result1 = FileIOExamples.printNLetterWord(
					FileIOExamples.testWords.stream(), wordLength);
			String result2 = FileIOExamples.printNLetterWord(
					FileIOExamples.filename, wordLength);

			switch (wordLength) {
			case 2:
				assertEquals(result1, "No 2-letter word found");
				assertEquals(result2, "aa");
				break;
			case 3:
				assertEquals(result1, "foo");
				assertEquals(result2, "aah");
				break;
			case 4:
				assertEquals(result1, "No 4-letter word found");
				assertEquals(result2, "aahs");
				break;
			case 5:
				assertEquals(result1, "No 5-letter word found");
				assertEquals(result2, "aahed");
				break;
			default:
				break;
			}
		}
	}
	
	@Test
	public void numWordsContaining(){
		
		assertEquals(FileIOExamples.numWordsContaining(FileIOExamples.testWords2.stream(), "q"), 2);
		assertEquals(FileIOExamples.numWordsContaining(FileIOExamples.testWords2.stream(), "j"), 0);
		
		assertEquals(FileIOExamples.numWordsContaining(FileIOExamples.filename, "q"), 2527L);
		assertEquals(FileIOExamples.numWordsContaining(FileIOExamples.filename, "j"), 2463L);
		
		assertEquals(FileIOExamples.numWordsContaining(FileIOExamples.testWords2.stream(), "oo"), 2);
		assertEquals(FileIOExamples.numWordsContaining(FileIOExamples.testWords2.stream(), "ee"), 3);
		
		assertEquals(FileIOExamples.numWordsContaining(FileIOExamples.filename, "oo"), 3776L);
		assertEquals(FileIOExamples.numWordsContaining(FileIOExamples.filename, "ee"), 3829L);
		
	}
	
}
