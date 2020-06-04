/**
 * 
 */
package com.main.java;

/**
 * @author amanb
 *
 */
public class Fibonacci {

	public static void main(String[] args) {

		long n = 16, t1 = 0, t2 = 1;
		for (long i = 1; i <= n; ++i) {
			System.out.print(t1 + "  ");
			long sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
}
