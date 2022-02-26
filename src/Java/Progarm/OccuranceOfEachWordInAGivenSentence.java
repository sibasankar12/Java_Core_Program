package Java.Progarm;

import java.util.HashSet;

public class OccuranceOfEachWordInAGivenSentence 
{
public static void main(String[] args) 
	{
		String s1="i am inevetible";
		     String[] ch = s1.split(" ");
	    HashSet <String>set = new HashSet<String>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for(String word: set)
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(word.equals(ch[i]))
				{
					count++;
				}
			}
			System.out.println(word+" " + count);
		}

	}

}
