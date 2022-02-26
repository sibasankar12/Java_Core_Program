package Java.Progarm;


import java.util.LinkedHashSet;

public class UniquecharInaString {

	public static void main(String[] args) 
	{
		String s="hello";
		//step 1: create the set collection
	
		LinkedHashSet <Character>set = new	LinkedHashSet<Character>();
     for(int i=0;i<s.length();i++)
     {
    	 set.add(s.charAt(i));
     }
     //step2 : compare each character of set to all character
    	
     for(Character ch:set )
    	 {
    		 int count=0;
    		 for(int i=0;i<s.length();i++)
    		 {
    			 if(ch==s.charAt(i))
    			 {
    		// step3
    			 count++;
    			 }
    		 }
    		 //step4 : print both character 
    		 if(count==1)
    		 {
    		 System.out.print(ch);
    	 }
     }

	}

}
