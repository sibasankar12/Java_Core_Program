package program;

public class ReverseTheWordsPosition {

	public static void main(String[] args) 
	{
		String s1="chilika is a lake";
		String s2="  ";
		String[] s3=s1.split(" ");
		for(int i=0;i<s3.length;i++)
		{
			s2=s3[i]+s2;
			
				}
		 s2=s2.trim();
		System.out.println(s2);
	}

}
