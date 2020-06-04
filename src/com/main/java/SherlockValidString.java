/**
 * 
 */
package com.main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author amanb
 *
 */
public class SherlockValidString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String solve = isValid("aabbccddeefghi");
		System.out.println(solve);
	}

	// Complete the isValid function below.
	static String isValid(String s) {
		int count1 = 0, count2 = 0;
		char[] word1 = s.replaceAll("[\\s+]", "").toCharArray();
		Arrays.sort(word1);
		HashMap<Character, Integer> hm = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		for (int i = 0; i < word1.length; i++) {
			if (!hm.containsKey(word1[i])) {
				hm.put(word1[i], 1);
				count1++;
			} else {
				hm.put(word1[i], hm.get(word1[i]) + 1);
				count2++;
				hm2.put(word1[i], count2);
			}
			count1 = 0;
			count2 = 0;
		}
		boolean flag = false;
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			int counters=0;
			  if(hm2.containsKey(entry.getKey())) {
				 
			 }
		}
		return s;
		
		
		
			}
}