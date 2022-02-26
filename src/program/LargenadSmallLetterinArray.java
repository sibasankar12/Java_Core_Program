package program;

public class LargenadSmallLetterinArray 
{
public static void main(String[] args)
{
	int a[]= {1,4,7,8};
  System.out.println("the min no is:");
  Min(a);
  System.out.println("the max no is:");
  Max(a);
}
	public static int Max (int[] a) 
	{
		
	    int max=a[0];
   for(int i=1;i<a.length;i++)
   {
	   if(a[i]>max)
	   {
		   max=a[i];
	   }
   }
   System.out.println(max);
   return max;
  	}
   public static int Min (int[] a)
   {
	  int min=a[0];
	  for(int i=1;i<a.length;i++)
	  {
		  if(a[i]<min)
		  {
			  min=a[i];
		  }
	  }
	  System.out.println(min);
	  return min;
	  }
   
}
