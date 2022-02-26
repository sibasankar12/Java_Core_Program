package Java.Progarm;

import java.util.HashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args)
	{
		String s1="i am inevetible inevetible";
		String[] ch = s1.split(" ");
		HashSet <String>set = new HashSet<String>();
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		for(String word: set)
		{
			System.out.println(word);
		}
	}
}