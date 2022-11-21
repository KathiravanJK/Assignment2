package week5.day1;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateWords {
	public static void main(String[] args) {
			String text="We learn java basics as part of java sessions in java week1";
			String[] split=text.split(" ");
			Set<String> emptyset=new LinkedHashSet<String>();
			
			for(int i=0;i<split.length;i++) {
				emptyset.add(split[i]);	
			}
			System.out.println(emptyset);
			
			
		}
	}


