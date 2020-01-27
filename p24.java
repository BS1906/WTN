import java.io.*;
import java.util.*;
class p24
{
public static void main(String []args)
{
int temp=Integer.parseInt(args[0]),s=Integer.parseInt(args[0]),sum=0,rem=0;
while(s>0)
{
rem=s%10;
sum=sum+rem;
s=s/10;
}
System.out.println("The sum of the digits of "+args[0]+ " is "+sum);
}
}