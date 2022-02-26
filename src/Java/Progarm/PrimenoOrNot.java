package Java.Progarm;

public class PrimenoOrNot {

	public static void main(String[] args) 
	{
		int n=8;
		int i=2;
		while(i<=n)
		{
			if(n%i==0)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		if(n==i)
		{
			System.out.println("primeno");
		}
		else
		{
			System.out.println("not primeno");
		}
	}
}
