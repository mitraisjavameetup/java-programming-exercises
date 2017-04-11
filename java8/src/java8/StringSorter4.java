package java8;
import java.util.Arrays;
import java.util.Comparator;

public class StringSorter4 {
	public static void doTests(){
		String[] testString = {"one","two","three","four"};
		System.out.print("Original: ");
		ArrayUtils.printArray(testString);
		Arrays.sort(testString, new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				
				return (s1.length() - s2.length());
			}
		});
		System.out.println("After Sorting by length: ");
		ArrayUtils.printArray(testString);
		Arrays.sort(testString, new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return (s1.charAt(s1.length()-1) - (s2.charAt(s2. length()-1)));
			}
		});
		System.out.println("After Sorting by last integer: ");
		ArrayUtils.printArray(testString);
	}
}
