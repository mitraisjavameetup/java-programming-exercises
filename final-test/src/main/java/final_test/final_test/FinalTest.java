package final_test.final_test;

import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.regex.Pattern;

public class FinalTest {
	
	public static void invalidWord(String inputFile, String outputFile) throws Exception {
		  Charset characterSet = Charset.defaultCharset();
		  Path outputpath = Paths.get(outputFile);
		  List<String> output = Files.lines(Paths.get(inputFile))
				  .filter(word -> word.contains("!") || word.contains(".") || word.contains(",") || word.contains("?") || word.contains("'"))
				  .collect(Collectors.toList());
		  PrintWriter out =
			      new PrintWriter(Files.newBufferedWriter(outputpath, characterSet));
		  for(String word :output) {
	          out.printf("%s%n", word);
	        }
		  out.close();
		
	}
	
	public static void normalizedWord(String inputFile, String outputFile) throws Exception {
		  Charset characterSet = Charset.defaultCharset();
		  Path outputpath = Paths.get(outputFile);
		  List<String> output = Files.lines(Paths.get(inputFile))
				  .map(String::toLowerCase)
				  .map(word -> word.replace(",", ""))
				  .map(word -> word.replace(".", ""))
				  .map(word -> word.replace("?", ""))
				  .map(word -> word.replace("!", ""))
				  .map(word -> word.replace("'", ""))
				  .collect(Collectors.toList());
		  PrintWriter out =
			      new PrintWriter(Files.newBufferedWriter(outputpath, characterSet));
		  
		  for(String word :output) {
	          out.printf("%s%n", word);
	        }
		  out.close();
		
	}
	
	public static void removeStopWord(String inputFile, String outputFile) throws Exception {
		  Charset characterSet = Charset.defaultCharset();
		  Path outputpath = Paths.get(outputFile);
		  List<String> output = Files.lines(Paths.get(inputFile))
				  .map(String::toLowerCase)
				  .filter(word -> word.length() > 2)
				  .filter(word -> !word.matches("for") && !word.matches("and") && !word.matches("that") 
						  && !word.matches("also") && !word.matches("into") && !word.matches("you") &&
						  !word.matches("can") && !word.matches("may") && !word.matches("not") &&
						  !word.matches("may") && !word.matches("we") && !word.matches("also") &&
						  !word.matches("the") && !word.matches("but") && !word.matches("your"))
				  .collect(Collectors.toList());
		  PrintWriter out =
			      new PrintWriter(Files.newBufferedWriter(outputpath, characterSet));
		  for(String word :output) {
	          out.printf("%s%n", word);
	        }
		  out.close();
	}
	
	 public static List<Map.Entry<String, Long>> mostAppearWord(String inputFile) throws Exception {
		 List<String> output = Files.lines(Paths.get(inputFile)).collect(Collectors.toList());
		 
		 Map<String, Long> map = output.stream()
			        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

			List<Map.Entry<String, Long>> result = map.entrySet().stream()
			        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			        .limit(10)
			        .collect(Collectors.toList());
		  return result;
	  }
	 
}
