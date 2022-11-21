package day3.assignments;

public class PrimeNumbers {
	public static void main(String args[])
    {
        int n , i , rem = 0 ;
        n = 7;
        for(i = 2 ; i < n ; i++)
        {
            if(n % i == 0)
            {
                rem = 1;
                break;
            }
            else
            {
                rem = 0 ;
            }
        }
        if(rem == 1) {
        System.out.println("Number is Prime");
        }
        else {
        System.out.println("Number is not prime");
        }
    }
	


}
