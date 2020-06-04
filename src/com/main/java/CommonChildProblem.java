/**
 * 
 */
package com.main.java;

/**
 * @author amanb
 *
 */
import java.io.*;
import java.util.*;
;

public class CommonChildProblem {

    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
    
     int[][] A = new int[s1.length()+1][s2.length()+1];

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                  if (s1.charAt(i) == s2.charAt(j)) {
                      A[i+1][j+1] = A[i][j] + 1;
                   } else {
                      A[i+1][j+1] = Math.max(A[i+1][j], A[i][j+1]);
                }
            }
        }
         // return A[s1.length()][s2.length()];
          
          // Second approach 
          
          char[] word1 = s1.replaceAll("[\\s+]", "").toCharArray();
 	      char[] word2 = s2.replaceAll("[\\s+]", "").toCharArray();	 
 	      Arrays.sort(word1);
 	      Arrays.sort(word2); 	    
 	    

 	    return A[s1.length()][s2.length()];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = "HARRYSALLY";

        String s2 = "SALLYHARRY";

        int result = commonChild(s1, s2);
        System.out.println("result-->"+result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

