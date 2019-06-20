import java.util.*;
import java.io.*;

public class hunter1
{
	public static void main(String args[])
	{
		Scanner get= new Scanner(System.in);
		int n,i,j;
		n=get.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=get.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			int count=0;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					
					count++;
				}
				
			}
			if(count>0)
				{
					System.out.print(a[i]+" ");
				}
		}
		
	}
}
