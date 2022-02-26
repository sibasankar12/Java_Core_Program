package program;

public class PrimeLimit {

	public static void main(String[] args)
	{
		int no=7;
		int count=0;
		for(int i=2;i<no-1;i++)
		{
				if(no%i==0)
				{
					count=count+1;
				}
			}
		if(count>0)
		{
			System.out.println("not a prime no");
		}
		else
		{
			System.out.println("prime no");
		}

	}

}
