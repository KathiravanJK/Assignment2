package day3.assignments;

public class FibonacciSeries {
	public static void main(String args[])  

	{    

	 int num1=0,num2=1,num,i,temp=6;        

	 System.out.print("Fibonacci series - "+num1+" "+num2);
	 
	 for(i=1;i<=temp;i++)    

	 { 
		 
	  num=num1+num2;
	  
	  System.out.print(" "+num);
	  
	  num1=num2;    

	  num2=num;

	 }
	 
     
	}} 
