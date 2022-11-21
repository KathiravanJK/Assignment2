package day2.assignments;

public class Calculator {
	
	public void addTwoNumbers(int a, int b) {	
		int c=a+b;
		System.out.println("c (add)= "+c);
	}
	
	public void subtractionTwoNumbers(int e, int f) {
		int d=e-f;
		System.out.println("d(sub)= "+d);
	}
	public void multipleTwoNumbers(double i, double j) {
		double g=i*j;
		System.out.println("g(multiple)= "+g);
	}
		
	public void divideTwoNumbers(float x, float y) {
			float z=x/y;
			System.out.println("z(divide)= "+z);
	}
	
	public static void main(String[] args) {
		Calculator math=new Calculator();
		math.addTwoNumbers(35, 10);
		math.subtractionTwoNumbers(35, 10);
		math.multipleTwoNumbers(35.01, 10.09);
		math.divideTwoNumbers(3F,0F);
	}
}
