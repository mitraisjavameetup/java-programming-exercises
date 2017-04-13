package final_test.final_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

public class FinalTestTest {
	String inputFile = "article.txt";
	@Test
	public void invalidWord() throws Exception{
		String outputFile = "invalid-words.txt";
		FinalTest.invalidWord(inputFile, outputFile);
		assertNotNull(Paths.get(outputFile));
		
		List<String> result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
		assertEquals(result.get(0), "way!");
		assertEquals(result.get(2), "body,");
		assertEquals(result.get(4), "ways.");
		assertEquals(result.get(5), "everybody's");		
		assertEquals(result.get(7), "light.");
		assertEquals(result.get(9), "health.");
		assertEquals(result.size(), 16);
	}
	
	@Test
	public void normalizedWord() throws Exception{
		String outputFile = "normal-words.txt";
		FinalTest.normalizedWord(inputFile, outputFile);
		assertNotNull(Paths.get(outputFile));
		
		List<String> result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
		assertEquals(result.get(0), "everyone");
		assertEquals(result.size(), 214);
	}
	
	@Test
	public void removeStopWord() throws Exception{
		String outputFile = "nostop-words.txt";
		FinalTest.removeStopWord("normal-words.txt", outputFile);
		assertNotNull(Paths.get(outputFile));
		
		List<String> result = Files.lines(Paths.get(outputFile)).collect(Collectors.toList());
		assertEquals(result.get(0), "everyone");
		assertEquals(result.get(result.size()-1), "reduced");
		assertEquals(result.size(), 123);
	}
	
	@Test
	public void mostAppearWord() throws Exception{
		List<Map.Entry<String, Long>> result = FinalTest.mostAppearWord("nostop-words.txt");
		assertNotNull(result.size());
		assertEquals(result.get(0).getKey(), "running");
	}
}
