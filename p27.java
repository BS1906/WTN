import java.io.*;
import java.util.*;
class p27
{
public static void main(String []args)
{
int i,j;
if(args.length==0)
{
System.out.println("Please enter an integer number");
}
else
{
for(i=1;i<=Integer.parseInt(args[0]);i++)
{
for(j=1;j<=Integer.parseInt(args[0]);j++)
{
if(j<=i)
{
System.out.print("*");
}
}
System.out.println();
}
}
}
}
