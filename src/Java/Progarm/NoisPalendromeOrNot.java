package Java.Progarm;

public class NoisPalendromeOrNot {

	public static void main(String[] args) 
	{
		int n=101;
		int temp=n;
		int rev=0;
		while(temp>0)
		{
			int diga=temp%10;
			rev=rev*10+diga;
			 temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println("palendrome");
		}
		else
		{
			System.out.println("not palendrome");
		}
	}

}
