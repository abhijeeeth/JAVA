import java.util.Scanner;
import java.io.*;
class Circle
	{
	double radius;
		public Circle(double r)
			{
			radius=r;
			}
		public double area()
			{
			return 3.14*radius*radius;
			}				
	}
class Cylinder extends Circle
	{
	double height;
	public Cylinder(double r,double h)
		{
		super(r);
		height=h;
		}
	public double volume()
		{
		return super.area()*height;
		}	
	}
class Cone extends Circle
	{
	double height;
	public Cone(double r,double h)
		{
		super(r);
		height=h;
		}
	public double volume()
		{
		return (super.area()*height)/3;
		}	
	} 
public class Cir
{
public static void main(String a[])
{
double r,h;
Scanner s=new Scanner(System.in);
System.out.println("Enter radius And Height");
r=s.nextDouble();
h=s.nextDouble();
Cylinder cl=new Cylinder(r,h);
Cone cn=new Cone(r,h);
System.out.println("volume of Cylinder : " + cl.volume());
System.out.println("volume of Cone : " + cn.volume());
}
}


























