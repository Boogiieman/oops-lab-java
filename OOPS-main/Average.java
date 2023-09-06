import java.util.*;
class NegativeInputException extends Exception
{
private static final long serialVersionUID = 1L;
public NegativeInputException(String n)
{
super(n);
}}
class Average
{
public static void main(String args[])
{
int number[];
int sum=0;
int i;
float avg;
float count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number:");
int n=sc.nextInt();
number=new int[n];
System.out.println("Enter the numbers:");
for(i=0;i<n;i++)
{
number[i]=sc.nextInt();
}
try 
{
for(i=0;i<n;i++)
{
if(number[i]<0)
{
throw new NegativeInputException("input numbers cannot be negative!!!!!!!!!!!!!!!");
}
else
{
sum=sum+number[i];
count++;
}
}
avg=sum/count;
System.out.println("Average:"+avg);
}
catch(NegativeInputException e)
{
System.out.println("________________EXCEPTION OCCURED_________________\n"+e);
}
}
}

