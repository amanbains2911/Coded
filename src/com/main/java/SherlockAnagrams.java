/**
 * 
 */
package com.main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author amanb
 *
 */
public class SherlockAnagrams {
	
	static int sherlockAndAnagrams(String s) {
	  Map<String, Integer> map = new HashMap<>();
	    int total = 0;
	    for(int i = 0 ; i < s.length(); i++)
	    {
	        for(int j=i+1 ; j <= s.length(); j++)
	        {
	            String currentSubString = s.substring(i,j);
	            char[] chars = currentSubString.toCharArray();
	            Arrays.sort(chars);
	            currentSubString = String.valueOf(chars);
	            if(map.containsKey(currentSubString)) 
	            {
	            	int value = map.getOrDefault(currentSubString, 0);
	            	if (value > 0) {
	            	    total += value;
	            	}
	            	map.put(currentSubString, ++value);
	            } 
	            else 
	            {	     
	                map.put(currentSubString, 1);
	            }
	        }
	    }
	    return total;
	}
	
	public static void main(String[] args) {
		String s="cdcd";
		int result = sherlockAndAnagrams(s);
		System.out.println("Result-->"+result);
	}

}
