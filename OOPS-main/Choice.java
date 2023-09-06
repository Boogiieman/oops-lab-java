import java.util.*;
class Choice
{
public static void main(String c[])
{
Scanner sc=new Scanner(System.in); //to accept input use Scanner
int a;
System.out.println("Enter choice");
a=sc.nextInt(); //integer input is accepted from use..
switch(a)
{
case 1:
System.out.println("You chose 1");
break;
case 2:
System.out.println("You chose 2");
break;
case 3:
System.out.println("You chose 3");
break;
default:
System.out.println("Enter correct choice");
}
}
}
