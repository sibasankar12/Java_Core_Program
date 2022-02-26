package ArrayProgram;

public class SwapFirstAndLastWordOfAString {

	public static void main(String[] args) 
	{
		String st="welcome to the tyss company";
		  String[] st1 = st.split(" ");
		  
		  String str1=st1[0];
		 st1[0] = st1[st1.length-1];
		 st1[st1.length-1] = str1;

	for(int i=0;i<st1.length;i++)
	{
		System.out.print(st1[i]+" ");
	}
	}
}


