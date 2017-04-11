package java8;

import java.util.Arrays;

public class ArrayUtils {

	public static <T> void printArray(T[] entries){
		System.out.println(Arrays.asList(entries));
	}
	public static <T> void printArray2(T[] entries){
		System.out.print("{");
		int lastIndex = entries.length -1;
		for(int i=0; i< lastIndex; i++){
			System.out.printf("%s, ", entries[i]);
		}
		System.out.printf("%s)%n", entries[lastIndex]);
	}
	private ArrayUtils() {};
}
