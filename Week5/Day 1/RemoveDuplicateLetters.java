package week5.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetters {
	public static void main(String[] args) {
		String name="paypal india";
		char[] charArray=name.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		for(int i=0;i<=charArray.length-1;i++) {
			charSet.add(charArray[i]);
			}
		System.out.println(charSet);
	} 
	
}

