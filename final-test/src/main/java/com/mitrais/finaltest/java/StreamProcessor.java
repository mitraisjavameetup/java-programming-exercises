package com.mitrais.finaltest.java;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.*;

@FunctionalInterface
public interface StreamProcessor {
  List<String> processStream(Stream<String> strings);
  
  public static List<String> processFile(String filename, StreamProcessor processor) {
	List<String> result = null;
    try(
      Stream<String> lines = Files.lines(Paths.get(filename))) {
      result = processor.processStream(lines);      
    } catch(IOException ioe) {
      System.err.println("Error reading file: " + ioe);
    }
	return result;
  }
}

