package day6.assignment5;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="We learn java basics as part basics of java sessions in java week1";
		
		String[] sp=text.split(" ");
		for (int i = 0; i < sp.length; i++) {
			for (int j=i+1; j<sp.length; j++) {
				if(sp[i].equals(sp[j])) {
					//System.out.println(" "+sp[j]);
					sp[j]="";
				}
			}
			System.out.print(" "+sp[i]);
				
		}
		
	}
	

}
