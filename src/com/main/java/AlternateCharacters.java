/**
 * 
 */
package com.main.java;


/**
 * @author amanb
 *
 */
public class AlternateCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sol="AAABBB";
		int m=alternatingCharacters(sol);
		System.out.println(m);

	}

	 // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    int count =0;
    char[] word1 = s.replaceAll("[\\s+]", "").toCharArray();
    for(int i=0;i<word1.length-1;i++) {
    	if(word1[i]==word1[i+1]) {
    		 count++;
    	}
    }
    return count;
    	

    }
}
