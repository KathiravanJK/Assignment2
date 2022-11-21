package day6.assignment5;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1= "stop";
		String text2= "post";
		
		if(text1.length()==text2.length()) {
		
		char[] Array1=text1.toCharArray();
		char[] Array2=text2.toCharArray();
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
		
		if(Arrays.equals(Array1, Array2))
		{
			System.out.println("same");
		} 
		else 
		{
			System.out.println("not same");
		} 
			
		} 
		else 
		{
			System.out.println("not same");
		}
			
		}

}

