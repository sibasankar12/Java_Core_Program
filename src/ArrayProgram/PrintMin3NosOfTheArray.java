package ArrayProgram;

public class PrintMin3NosOfTheArray {

	public static void main(String[] args) 
	{
	
		
int[] array1= {20,30,50,10,40};
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i]>array1[j])
				{
					int temp=array1[i];
					array1[i]=array1[j];
					array1[j]=temp;
				}
			}
			
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(array1[i]);
		}

	}
	}


