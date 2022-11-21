package day4.assignments;

import java.util.Arrays;

public class FindSecondLargest {
	
       public static void main(String[] args) {
	   int[] number= {3,2,11,4,6,7,5,4,5,6,7,2,3};
	   
	   int sum=number.length;
	
	Arrays.sort(number);
	
	//for (int i = sum-1; i>=0; i--) {
		//System.out.print(number[i]);
	//}
		System.out.println("Second Largest Number- "+number[sum-2]);
		
	}
}
	
