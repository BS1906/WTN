import java.io.*;
import java.util.*;
class p25
{
public static void main(String []args)
{
if(args.length==0)
{
System.out.println("Please enter the month in numbers");
}
else
{
if(Integer.parseInt(args[0])>0&&Integer.parseInt(args[0])<=12)
{
switch(Integer.parseInt(args[0]))
{
	case 1:
	      System.out.println("January");break;
	case 2:
	      System.out.println("february");break;
	case 3:
	      System.out.println("march");break;
	case 4:
	      System.out.println("april");break;
        case 5:
	      System.out.println("may");break;
	case 6:
	      System.out.println("june");break;
	case 7:
	      System.out.println("july");break;
	case 8:
	      System.out.println("august");break;
	case 9:
	      System.out.println("septemeber");break;
	case 10:
	      System.out.println("october");break;
	case 11:
	      System.out.println("November");break;
	case 12:
	      System.out.println("Decemeber"); break;
	
     default:
      System.out.println("Invalid month");break;
}
}
else
{
  System.out.println("Invalid month");
}
}
}
}