import java.io.*;
import java.util.*;
class p26
{
public static void main(String []args)
{
int fact=1,i=1;
if(args.length==0)
{
System.out.println("Please enter an Integer number");
}
else
{
if(Integer.parseInt(args[0])==0)
{
fact=1;
}
else
{
do
{
fact=fact*i;
i++;
}while(i<=Integer.parseInt(args[0]));
System.out.println("The factorial of "+Integer.parseInt(args[0])+" is "+fact);
}
}
}
}