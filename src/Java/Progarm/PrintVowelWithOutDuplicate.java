package Java.Progarm;

import java.util.LinkedHashSet;

public class PrintVowelWithOutDuplicate 
{

public static void main(String[] args) 
{
    String s="India";
       s=s.toLowerCase();
     LinkedHashSet<Character>str = new LinkedHashSet<Character>();
	  for(int i=0;i<s.length();i++)
	  {
		  str.add(s.charAt(i));
	  }
	  for(Character ch:str)
	  {
		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		  {
			  System.out.println(ch);
		  }
	  }
	
	}

}
