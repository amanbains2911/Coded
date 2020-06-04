/**
 * 
 */
package com.main.java;

/**
 * @author amanb
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   int i =0;
	       int j =0;
	       String  primeNumbers = "";
	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int c=0; 	  
	         for(j =i; j>=1; j--)
		       {
	             if(i%j==0)
		           {
	 		     c = c + 1;
		      }
		   }
		  if (c ==2)
		  {
		      primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
	}

