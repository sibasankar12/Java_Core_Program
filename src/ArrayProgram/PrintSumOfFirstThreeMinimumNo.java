package ArrayProgram;

public class PrintSumOfFirstThreeMinimumNo {

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
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+array1[i];
			
		}
      System.out.println(" sum of first three min. no is " + sum);
	}

	}


