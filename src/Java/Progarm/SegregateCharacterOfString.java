package Java.Progarm;

public class SegregateCharacterOfString {

	public static void main(String[] args) {
		String s1="abc#@123";
		String s2="";
		String s3="";
		String s4="";
		for(int i=0;i<s1.length();i++)
		{
			if((s1.charAt(i)>='A'&& s1.charAt(i)<='Z')|| (s1.charAt(i)>='a' && s1.charAt(i)<='z'))
{
	     s2=s2+s1.charAt(i);
}
else if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
{
	s3=s3+s1.charAt(i);
}
else {
	s4=s4+s1.charAt(i);
}
		}
		System.out.println(s2+" "+s3+" "+s4);

	}

}
