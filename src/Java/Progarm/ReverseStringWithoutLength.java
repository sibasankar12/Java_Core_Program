package Java.Progarm;

public class ReverseStringWithoutLength {

	public static void main(String[] args) 
	{
		
		String st="Avengers";
		char[] st1 = st.toCharArray();
		int count=0;
		for(char a: st1)
		{
			count++;
			}
    for(int i=count-1;i>=0;i--)
    {
    	System.out.print(st1[i]);

	}

}
}
