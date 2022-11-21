package day4.assignments;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		
		int[] number = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		for (int i = 0; i<number.length; i++) {
	        for (int j=i+1; j<number.length; j++)
	    
	    {
	    	if(number[i]==number[j])
	    		
	    		System.out.print(" "+number[i]);
	    		

	    }
	}
		
	}
	}

	
	

	