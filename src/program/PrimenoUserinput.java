package program;

import java.util.Scanner;

public class PrimenoUserinput 
{

	public static void main(String[] args) 
	{
		boolean isprime=true;
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int a=sc.nextInt();
		int count=0;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				 isprime=false;
				break;
			}
		}
   if(isprime)
   {
	  System.out.println("prime"); 
   }
   else
   {
	   System.out.println("not prime");
   }
	}

}
