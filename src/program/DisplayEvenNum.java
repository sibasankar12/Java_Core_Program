package program;

public class DisplayEvenNum {

	public static void main(String[] args) 
	{
	int []a= {34,45,87,65};
int count=0;    

for(int i=0;i<a.length;i++)
{
if (a[i]%2==0)
   {
	count++;	
	System.out.println("even");  
   } 
else
{
System.out.println("odd");  
   }
}
System.out.println(count);	}
}



