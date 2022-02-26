package program;

public class FibonaciSeries 
{

	public static void main(String[] args)
	{
	int limit=10;
	int num1=0;
	int num2=1;
	System.out.println("Fibonacci series of the number"+limit+" is  :");
	for(int i=1;i<=limit;i++)
	{
	System.out.print(num1+"  ");	
	int	sum=num1+num2;
		num1=num2;
		num2=sum;
	}
	
	}
}
