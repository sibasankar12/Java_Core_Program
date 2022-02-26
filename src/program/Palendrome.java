package program;

public class Palendrome {

	public static void main(String[] args)
	{
		int number=1221;
		int sum=0;
		int x;
		int originalno=number;
		while(number>0)
		{
			x=number%10;
		   sum=sum*10+x;
		   number=number/10;  
		}
		if(originalno==sum)
		{
			System.out.println("it is pallendrome");
		}
		else
		{
			System.out.println("not a pallendrome");
		}
	}
}



