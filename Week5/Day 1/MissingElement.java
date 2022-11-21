package week5.day1;

import java.util.Set;
import java.util.TreeSet;

public class MissingElement {
	public static void main(String[] args) {
		int [] num= {1,2,4,5,6,8,10};
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<num.length;i++) {
			for(int j=i+1; j<num.length;) {
				if(num[j]-num[i]==1) {
			          break;
				} else {
					set.add((num[i]+num[j])/2);
					break;
				}
		}
		
}
		System.out.println(set);
}
}