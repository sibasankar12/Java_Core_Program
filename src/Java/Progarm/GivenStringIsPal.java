package Java.Progarm;

public class GivenStringIsPal {

	public static void main(String[] args) 
	{
		String st="amma";
		String st1="";
		for(int i=st.length()-1; i>=0;i--)
		{
			st1=st1+st.charAt(i);
		}
	
		if(st.equals(st1))
		{
			System.out.println("pallendrome");
		}
		else
		{
			System.out.println("not pallendrome"); 
		}
	}

}
