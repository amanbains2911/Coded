/**
 * 
 */
package com.main.java;

import java.util.Arrays;

/**
 * @author amanb
 *
 */
public class Anagram {

	public boolean isAnagram(String firstWord, String secondWord) {
		if(firstWord.length()!=secondWord.length()) {
			return false;
		}
	     char[] word1 = firstWord.replaceAll("[\\s+]", "").toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s+]", "").toCharArray();	 
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     return Arrays.equals(word1, word2);
	}
	
	public static void main(String[] args) {
		boolean m=false;
		Anagram am =new Anagram();
		m=am.isAnagram("nul null nulll", "llun lun lllun");
		System.out.println("isAnagram-->"+m);
	}
}
