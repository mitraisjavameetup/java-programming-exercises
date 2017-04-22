import java.util.*;

public class Streamtest {
	 public static void main(String[] args) {
		    List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
		    String s1 = words.stream()
		                     .filter(word -> word.contains("o"))
		                     .findFirst()
		                     .orElse(null);
		    System.out.println(s1);
		    String s2 = words.stream()
		                     .filter(word -> word.length() > 5)
		                     .findFirst()
		                     .orElse(null);
		    System.out.println(s2);
		  }
}
