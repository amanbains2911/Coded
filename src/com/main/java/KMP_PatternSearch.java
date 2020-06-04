/**
 * 
 */
package com.main.java;

/**
 * @author amanb
 *
 */

public class KMP_PatternSearch { 
	void KMPSearch(String pat, String txt) 
	{ 
		int m = pat.length(); 
		int n = txt.length(); 

		int A[] = new int[m]; 
		int j = 0; 
		computeLPSArray(pat, m, A); 

		int i = 0; // index for txt[] 
		while (i < n) { 
			if (pat.charAt(j) == txt.charAt(i)) { 
				j++; 
				i++; 
			} 
			if (j == m) { 
				System.out.println("Found pattern " + "at index " + (i - j)); 
				j = A[j - 1]; 
			} 

			// mismatch after j matches 
			else if (i < n && pat.charAt(j) != txt.charAt(i)) { 
				// Do not match lps[0..lps[j-1]] characters, 
				// they will match anyway 
				if (j != 0) 
					j = A[j - 1]; 
				else
					i = i + 1; 
			} 
		} 
	} 

	void computeLPSArray(String pat, int m, int A[]) 
	{ 
		// length of the previous longest prefix suffix 
		int len = 0; 
		int i = 1; 
		A[0] = 0; // lps[0] is always 0 

		// the loop calculates lps[i] for i = 1 to M-1 
		while (i < m) { 
			if (pat.charAt(i) == pat.charAt(len)) { 
				len++; 
				A[i] = len; 
				i++; 
			} 
			else // (pat[i] != pat[len]) 
			{  
				if (len != 0) { 
					len = A[len - 1]; 

				} 
				else
				{ 
					A[i] = len; 
					i++; 
				} 
			} 
		} 
	} 

	public static void main(String args[]) 
	{ 
		String txt = "ABABDABACDSSSSSABABCAEEEBAB"; 
		String pat = "ABABCABAB"; 
		new KMP_PatternSearch().KMPSearch(pat, txt); 
	} 
} 


