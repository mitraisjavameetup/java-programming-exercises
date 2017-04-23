package com.mitrais.cdc.java;

import java.util.concurrent.*;

public class ParallelPrimeMarker extends RecursiveTask<Void> {
	private static final int PARALLEL_CUTOFF = 10;
	private boolean[] primeFlags;
	private int lowerIndex, upperIndex;

	public ParallelPrimeMarker(boolean[] primeFlags, int lowerIndex, int upperIndex) {
		this.primeFlags = primeFlags;
		this.lowerIndex = lowerIndex;
		this.upperIndex = upperIndex;
	}

	@Override
	protected Void compute() {
		int range = upperIndex - lowerIndex;
		if (range <= PARALLEL_CUTOFF) {
			MathUtils.markPrimesSerial(primeFlags, lowerIndex, upperIndex);
		} else {
			int middleIndex = lowerIndex + range / 2;
			ParallelPrimeMarker leftMarker = new ParallelPrimeMarker(primeFlags, lowerIndex, middleIndex);
			ParallelPrimeMarker rightMarker = new ParallelPrimeMarker(primeFlags, middleIndex, upperIndex);
			leftMarker.fork();
			rightMarker.compute();
			leftMarker.join();
		}
		return (null);
	}
}
