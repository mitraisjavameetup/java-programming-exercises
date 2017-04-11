package java8;
import java.util.Arrays;

public class StringSorter4jav8 {
	public static void doTests(){
		
		String[] testString = {"Owo","One","Three","Four"};
		System.out.print("Original: ");
		//Shortest to Longest//
		ArrayUtils.printArray(testString);
		Arrays.sort(testString,(s1,s2) -> (s1.length() - s2.length()));
		System.out.print("After Sorting by length: ");
		ArrayUtils.printArray(testString);
		
		//Longest to Shortest//
		Arrays.sort(testString,(s1,s2) -> (s1.charAt(s1.length()-1) - s2.charAt(s2.length()-1)));
		System.out.print("After Sorting by reverse length: ");
		Arrays.sort(testString,(s1,s2) -> s2.length() - s1.length());
		ArrayUtils.printArray(testString);
		
		//Show First Character form a-z
		System.out.print("Alphabetically by the first Character only: ");
		Arrays.sort(testString,(s1,s2) -> (s1.charAt(0) - s2.charAt(0)));
		ArrayUtils.printArray(testString);
		
		//Show a String that
		System.out.print("String that contain e first: ");
		Arrays.sort(testString,(s1,s2) -> (s1.charAt(s1.length()-1) + s2.charAt(s2.length()-1)));
		ArrayUtils.printArray(testString);
		
	}
}
