import java.io.*;
import java.util.*;
class p31
{
public static void main(String []args)
{
	int max=0;

	int[] a=new int[10];
	//System.out.println(args.length);
	int i,j;
	if(args.length!=9)
	{
		System.out.println(" Please enter 9 integers");
	}
	else
	{
		for(i=0;i<9;i++)
		{
		 a[i]=Integer.parseInt(args[i]);
		}
		int k=0;
		for(i=1;i<=9;i++)
		{
			System.out.print(a[k]+" ");
			k++;
			if(i%3==0)
			{
			System.out.println();
			}
		}
			for(i=0;i<9;i++)
			{
				if(max<a[i])
				{
				max=a[i];
				}
			}

	}
System.out.println("The biggest number in the given array is " +max);
}
}

