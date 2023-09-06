import java.util.Scanner;
import pack.arp;
public class Findarea
 {
  public static void main(String args[])
   {
    float area,perimeter;
    Scanner in=new Scanner(System.in);
    arp h=new arp();
    System.out.println("Enter length of rectangle:");
    float a=in.nextFloat();
    System.out.println("Enter breadth of rectangle:");
    float b=in.nextFloat();
    arp.Rectangle r=h.new Rectangle();
    area=r.area(a,b);
    perimeter=r.perimeter(a,b);
    System.out.println("Rectangle:area="+area+"perimeter="+perimeter);
    System.out.println("Enter radius of circle:");
    float c=in.nextFloat();
    float pie=3.14f;
    arp.Circle cir=h.new Circle();
    area=cir.area(c,pie);
    perimeter=cir.perimeter(c,pie);
    System.out.println("Circle:Area="+area+"perimeter="+perimeter);
   }
  }
