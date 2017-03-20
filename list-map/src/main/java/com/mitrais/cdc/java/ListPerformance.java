package com.mitrais.cdc.java;

import java.util.List;

public class ListPerformance {

	/*
	 * Do some timing tests to see if you can verify the performance claims of
	 * the lecture regarding the difference between ArrayList and LinkedList for
	 * accessing the middle element. Hints: • Use System.currentTimeMillis or
	 * System.nanoTime to lookup the current time. Compute a delta and divide to
	 * get an elapsed time in seconds. • To ensure meaningful results, use very
	 * long lists and access the middle element many times. • Run several tests,
	 * each with larger and larger lists.
	 */

	public static double timeAccess(String label, List<String> list) {
		long waktu_kunam=System.currentTimeMillis();
		list.get((list.size()-1)/2);
		return (System.currentTimeMillis()-waktu_kunam);

	}
	
}
