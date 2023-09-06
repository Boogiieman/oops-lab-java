import java.util.Scanner;
class StackArr
{
int a[]=new int[10];
int top=-1,ch,item,i;
Scanner sc=new Scanner(System .in);
public void stackoperation()
{
System.out.println("Enter the size of the array:");
int n=sc.nextInt();
do
{
System.out.println("\n\t Choice:");
System.out.println("\n1.push\n2.pop\n3.display\n4.exit");
System.out.println("enter the choice");
ch=sc.nextInt();
switch(ch)
{
case 1:
if(top>n-1)
{
System.out.println("stack overflow");
}
else
{
System.out.println("enter the elements");
item=sc.nextInt();
top=top+1;
a[top]=item;
break;
}
case 2:
if(top<0)
{
System.out.println("stack underflow");
}
else
{
a[top]='\0';
top=top-1;
}
break;
case 3:
if(top<0)
{
System.out.println("\n stack is empty");
}
else
{
System.out.println("\n stack is ");
for(i=top;i>=0;i--)
{
System.out.println(a[i]);
}
}
case 4:
break;
default:System.out.println("\n invalid choice");
}
}while(ch!=0);
}
}
class Stack
{
public static void main(String[] args)
{
StackArr sa=new StackArr();
sa.stackoperation();
}
}


