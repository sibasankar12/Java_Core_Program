package Java.Progarm;

public class ReversetheStringwithThirdVariable {

	public static void main(String[] args)
	{
		String st="Thor";
		String st1=" ";
		for(int i=st.length()-1;i>=0;i--)
		{
			st1=st1+st.charAt(i);
		}
		System.out.println(st1);

	}

}
