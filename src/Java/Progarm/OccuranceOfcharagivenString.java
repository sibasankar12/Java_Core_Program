package Java.Progarm;

public class OccuranceOfcharagivenString {

	public static void main(String[] args) 
	{
		String name="i am Lazy boy";
		String st=name.replace(" ", "").toLowerCase();
		System.out.println(st);
		char[] st1 = st.toCharArray();
		int count=0;
		for(int i=0;i<=25;i++ )
		{
			char ch=(char) ('a'+i);
			for(int j=0;j<st1.length;j++)
			{
				if(ch==st1[j])
				{
					count++;
				}
			}
			System.out.println(ch+" has "+count+" occurance ");
			count=0;
		}

	}

}
