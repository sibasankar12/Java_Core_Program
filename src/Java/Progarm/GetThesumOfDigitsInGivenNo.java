package Java.Progarm;

public class GetThesumOfDigitsInGivenNo
{
	public static void main(String[] args) 
	{
		int num=456;

		int sum=0;
		while(num>0)
		{
			int dig=num%10;
			sum=sum+dig;
			num=num/10;
		}
		System.out.println(sum);

	}

}
