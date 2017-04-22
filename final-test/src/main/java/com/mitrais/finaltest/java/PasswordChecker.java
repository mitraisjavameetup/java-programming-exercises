package com.mitrais.finaltest.java;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class PasswordChecker {
	public static String inputFile = "password-list.txt";
	public static Scanner input;
	
	public static void main(String[] args) throws IOException {
		input = new Scanner(System.in);
		String subPassword;
		
		System.out.print("Enter password that you want to check : ");
		subPassword = input.next();
		PasswordChecker.similarPassword(inputFile, subPassword);
		System.out.print("File created.");
	}
	
	public static List<String> similarPassword(Stream<String> passwords, String subPassword) {
		
		/*
		 * return common password that contains subpassword
		 */
		
		return passwords.filter(password -> password.contains(subPassword)).collect(Collectors.toList());
	}

	public static void similarPassword(String filename, String subPassword) throws IOException {
		
		/*
		 * create text file that consist of similar password
		 */
		String outputFile = String.format("password-similar-to-%s.txt", subPassword);
		Charset charset = Charset.defaultCharset();
		Path path = Paths.get(outputFile);
		List<String> lines = StreamProcessor.processFile(filename, password -> similarPassword(password, subPassword));
		Files.write(path, lines, charset);
	}
}
