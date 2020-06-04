/**
 * 
 */
package com.main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author amanb
 *
 */
public class CheckPallindrome {

	public static void main(String[] args) {
		checkDuplicate();
		String str = "abacvvvvcvabba";
		int count=0;
		int k=str.length() - 1;
		for(int i=0; i<k; i++, k--) {
			if(str.charAt(i) != str.charAt(k)) {
				  count++;
			}else {
				count=-1;
			}
		}
		if(count>0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	public static void checkDuplicate() {
		String input="Good bye bye HBC HBC HBC Thank Thank you you ";
		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+"; 
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); 
        Matcher m = p.matcher(input); 
        while (m.find()) { 
            input = input.replaceAll(m.group(),m.group(1)); 
        } 
        System.out.println("Final String -->"+input);
	}
}	


