package Java.Progarm;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) 
	{
		String s1="hello";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.print(ch);
		}

	}

}
