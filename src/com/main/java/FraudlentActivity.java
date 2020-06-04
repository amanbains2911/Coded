/**
 * 
 */
package com.main.java;

import java.util.Arrays;

/**
 * @author amanb
 *
 */
public class FraudlentActivity {
	public static int ActivityNotifications(int[] expenditure, int d)
	{
	 int notifications = 0;
	 int[] arr = new int[d];
	 arr=Arrays.copyOf(expenditure, d);
	 Arrays.sort(arr);
	 for (int i = d; i < expenditure.length; i++)
	 {
	   if (expenditure[i] >= arr[d / 2] + arr[(d - 1) / 2])
	   {
		   notifications++;
	   }
	   int index = binarySearch(arr, expenditure[i - d]);
	   arr= Arrays.copyOf(arr, index + 1);
	   index = binarySearch(arr, expenditure[i]);
	   index = index >= 0 ? index : ~index;
	   arr=Arrays.copyOf(arr, d - index - 1);
	   arr[index] = expenditure[i];
	 }
	 return notifications;
	}
	
	public static int binarySearch(int[] sortedList , int number) {
		int min=0;
		int max=sortedList.length-1;
		
		while(min<=max) {
			int mid= min +(max-min)/2;
			if(sortedList[mid]==number) {
				return mid;
			}if(sortedList[mid]> number) {
				max=mid-1;
			}else {
				min=mid+1;
			}
		} return -1;
	}

}
