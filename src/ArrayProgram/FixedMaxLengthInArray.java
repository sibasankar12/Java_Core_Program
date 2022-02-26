package ArrayProgram;

public class FixedMaxLengthInArray {

	public static void main(String[] args) 
	{
String[] array1= {"hello12","tyss123","all","wellcome","to","abcdefgh","tyss123"};
		
         String MaxElement=array1[0];
		for(int i=1;i<array1.length;i++)
		{
			if(MaxElement.length()<array1[i].length())
			{
				MaxElement=array1[i];
			}
			
		}
		
		
		for(int i=0;i<array1.length;i++)
		{
			if(MaxElement.length()==array1[i].length())
			{
				System.out.println(array1[i]);
		}

	}
		
		

	}

}
