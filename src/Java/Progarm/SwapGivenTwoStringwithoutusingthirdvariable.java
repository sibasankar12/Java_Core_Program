package Java.Progarm;

public class SwapGivenTwoStringwithoutusingthirdvariable
{
	public static void main(String[] args) 
	{
		String a="Loki";
		String b="Vision";

		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());

		System.out.println(a);
		System.out.println(b);

	}



}


