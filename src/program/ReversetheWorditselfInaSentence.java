package program;

public class ReversetheWorditselfInaSentence 
{
public static void main(String[] args) 
	{
		String s1="ram is a good boy";
		char[] s2=s1.toCharArray();
		String s3=" ";
	for(int i=0;i<s2.length;i++)
		{
		s3=s2[i]+s3;
	}
System.out.println(s3);
	}
}
