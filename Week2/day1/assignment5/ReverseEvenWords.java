package day6.assignment5;


public class ReverseEvenWords {
	public static void main(String[] args) {
		String test="I am a software tester";
		
		String[] split=test.split(" ");
		for (int i = 0; i < split.length; i++) {
			//System.out.println(split[i]);
			if(i%2==1) {
				char[] reverseName=split[i].toCharArray();
				for (int j = reverseName.length-1; j >= 0; j--) {
					System.out.print(" "+reverseName[j]);
				}
			} else {
				System.out.print("");
				System.out.print(" "+split[i]);
			}
		
			}
		}
		
	}



