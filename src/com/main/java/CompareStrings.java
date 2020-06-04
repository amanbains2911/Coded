/**
 * 
 */
package com.main.java;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;

/**
 * @author amanb
 *
 */
public class CompareStrings {
	
	 // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    
    	if(Pattern.compile("["+s2+"]").matcher(s1).find())
            return "YES";
        else 
           return "NO";
    }
    
    static int checkStringsSwaps(String a,String b) {
    	HashMap<Character, Integer> hm=new HashMap<>();
		int count=0;
		for(int i=0;i<a.length();i++){
			if(!hm.containsKey(a.charAt(i))){
				hm.put(a.charAt(i), 1);
			}else{
				hm.put(a.charAt(i),hm.get(a.charAt(i))+1);
			}
		}
		for(int i=0;i<b.length();i++){
			if(!hm.containsKey(b.charAt(i))){
				count++;
			}else{
				hm.put(b.charAt(i),hm.get(b.charAt(i))+1);
			}
		}
		for(Entry<Character,Integer> entry:hm.entrySet()){
			if(entry.getValue()!=0){
				count+=Math.abs(entry.getValue());
			}
		}
		return count;
    }

    public static void main(String[] args) {  
            String s1 = "fcrxzwscanmligyxyvym";
            String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
            String result = twoStrings(s1, s2);   
            int count=checkStringsSwaps(s1,s2);
            System.out.println(count);
            System.out.println("Result-->"+result);  
        }


}
