import java.util.*;
class Area
{
	void calculateArea(float x)
	{
		System.out.println("Area of the square"+x*x+"sq.units");
	}
	void calculateArea(float x, float y)
	{
		System.out.println("Area of rectangle"+x*y+"sq.units");
	}
	void calculateArea(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle"+area+"sq.units");
	}
	public static void main(String args[])
	{
		int s;
		float l,b;
		double r; 
		Area obj=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square");
		s=sc.nextInt();
		System.out.println("Enter length & breadth of a rectangle");
		l=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Enter radius of circle");
		r=sc.nextDouble();
		obj.calculateArea(s);
		obj.calculateArea(l,b);
		obj.calculateArea(r);
	}
}
