package program;

import java.util.Scanner;

public class YearIsLeapYearOrNot {

	public static void main(String[] args) 
	{
	System.out.println("Enter a year :");
	Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    if((year%400==0) ||(year%4==0) & (year%100!=0))
    {
    	System.out.println("Year is a leap year");
    }
    else
    {
    	System.out.println("Year is not a leap Year");
    }
	}

}
