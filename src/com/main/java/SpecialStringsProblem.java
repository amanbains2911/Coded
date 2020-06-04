/**
 * 
 */
package com.main.java;

/**
 * @author amanb
 *
 */
import java.io.*;
import java.util.HashMap;

public class SpecialStringsProblem {

	// Complete the substrCount function below.
	static long substrCount(int n, String s) {
		long counter = 0;
		int length = s.length();
		HashMap<Integer,String> hm = new HashMap<>();
		for (int i = 0; i < length; i++) {
			// if the current symbol is in the middle of palindrome, e.g. aba
			int m = 1;
			while (i - m >= 0 && i + m < length && s.charAt(i - m) == s.charAt(i - 1)
					&& s.charAt(i + m) == s.charAt(i - 1)) {
				counter++;
				m++;
			}
			// if this is repeatable characters aa
			int repeats = 0;
			while (i + 1 < length && s.charAt(i) == s.charAt(i + 1)) {
				repeats++;
				i++;
			}
			counter += repeats * (repeats + 1) / 2;
		}
		return counter + length;

	}

	public static void main(String[] args) throws IOException {

		int n = 7;

		String s = "abcbaba";
		long result = substrCount(n, s);
		System.out.println(result);

	}
}
