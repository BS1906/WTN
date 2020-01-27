import java.io.*;
import java.util.*;
class p23
{
public static void main(String []args)
{
int temp=Integer.parseInt(args[0]),s=Integer.parseInt(args[0]),sum=0,rem=0;
while(s>0)
{
rem=s%10;
sum=sum*10+rem;
s=s/10;
}
if(temp==sum)
{
System.out.println(temp+" is a palindrome");
}
else
{
System.out.println(temp+" is not a palindrome");
}
}
}