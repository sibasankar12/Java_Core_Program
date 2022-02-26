package ArrayProgram;

public class PrintANoIsHappyNoOrNot {

	public static void main(String[] args) 
	{
		int num=568;

		int n=num;


		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int  r=n%10;	
				sum=sum+r; 
				n=n/10;  
			}
			n=sum; 
		}
		System.out.println(n);
	}




}

