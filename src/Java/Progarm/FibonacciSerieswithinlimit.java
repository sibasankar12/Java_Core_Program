package Java.Progarm;

public class FibonacciSerieswithinlimit {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i=0; i<10;i++)
		{
			int c=a+b;
			if(c<25)
			{
				System.out.println(c);
				a=b;
				b=c;
			}
			else 
			{
				break;
			}
		}

	}

}
