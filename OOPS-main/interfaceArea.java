import java.util.*;
interface areaperi
{
void area();
void perimeter();
}
class rectangle implements areaperi
{
int l=10,b=20;
public void area()
{
System.out.println("Area of rectangle="+l*b);
}
public void perimeter()
{
System.out.println("Perimeter of rectangle="+(2*(l+b)));
}
}
class circle implements areaperi
{

int r=10;
public void area()
{
System.out.println("Area of circle="+3.14*r*r);
}
public void perimeter()
{
System.out.println("Perimeter of circle="+2*3.14*r);
}
}
class interfaceArea 
{
public static void main(String args[])
{
rectangle r=new rectangle();
circle c=new circle();
int ch=0;
Scanner sc=new Scanner(System.in);
do
{
System.out.println("Enter your choice:");
System.out.println("1. Circle \n2. Rectangle \n3. Exit");
ch=sc.nextInt();
switch(ch)
{
case 1:
c.area();
c.perimeter();
break;
case 2:
r.area();
r.perimeter();
break;
case 3:
System.exit(0);
}
}while(ch!=0);
}
}
