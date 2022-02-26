package Java.Progarm;

public class PrintSumOfDigitInAString {

	public static void main(String[] args) 
	{
		String s1="abc@1234";
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0'  && s1.charAt(i)<='9' )
			{
				int n=s1.charAt(i)-48;
				sum=sum+n;
			}

		}
  System.out.println(sum);
	}

}
