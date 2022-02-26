package Java.Progarm;

public class PrintName100timesWithoutLoop 
{
	public static void printname(int a)
	{

		if(a<=100)
		{

			System.out.println("Groot"+a);
			printname(a+1);	
		}

	}

	public static void main(String[] args) 
	{
		printname(1);


	}

}
