package day6.assignment5;

public class OddIndexToUpperCase2 {
	public static void main(String[] args) {
		String name="changeme";
		
            
		char[] Array=name.toCharArray();
		for(int i=0; i<Array.length; i++) {
			
		
			if (i%2==1) {
				String name1="";
				name1=name1+Array[i];
				System.out.print(name1.toUpperCase());
			} else {
		         String name2="";
				name2=name2+Array[i];
				System.out.print(name2.toLowerCase());
			}
				
		}
		
		
	}
}

