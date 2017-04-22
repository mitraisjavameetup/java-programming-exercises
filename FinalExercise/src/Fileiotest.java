import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fileiotest {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String monthString;
		int counter = 0;
		
		while (counter != 4) {
			System.out.println("||1. Print Words || 2. Print N Letter Words || 3. Num Word Containing||");
			System.out.println("Please input your choice to shown the output on FileiOExamples: ");
			
			int counter2 = sc.nextInt();
			switch (counter2) {
			case 1:
				FileIoExamplesTest.print10LetterWord();
			case 2:
				FileIoExamplesTest.printNLetterWord();
			case 3:
				FileIoExamplesTest.numWordsContaining();
			case 4: break;

			}
			counter=counter2;
		}
	}
}
