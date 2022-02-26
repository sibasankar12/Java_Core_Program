package program;

import java.util.Scanner;

public class IsTheNoPrimeOrNot {

	public static void main(String[] args) 
	{
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
	for(int j=2;j<=num/2;j++)
		{
		if(num%j==0)
			{
				isPrime=false;
			    break;
			}
		}
    if(isPrime)
    {
    	System.out.println("prime no");
		}
    else
    {
    	System.out.println("not a prime no");
    }
		}
	}
	


