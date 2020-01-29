import java.io.*;
import java.util.*;
class p32
{
public static void main(String []args)
{
	int[] a=new int[10];
	int i,j;
	if(args.length!=4)
	{
		System.out.println(" Please enter 4 integers");
	}
	else
	{
		for(i=0;i<4;i++)
		{
		 a[i]=Integer.parseInt(args[i]);
		}
		int k=0;
		System.out.println("The given array is : ");
		for(i=1;i<=4;i++)
		{
			System.out.print(a[k]+" ");
			k++;
			if(i%2==0)
			{
			System.out.println();
			}
		}
		k=k-1;
		System.out.println("The reverse of the array is : ");
      		for(i=1;i<=4;i++)
		{
			System.out.print(a[k]+" ");
			k--;
			if(i%2==0)
			{
			System.out.println();
			}
		}
	}
}
}