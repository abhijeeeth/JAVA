
import java.io.*;
import java.util.*;

abstract class Shape {

  public abstract double getArea();
}


class Circle extends Shape {
  private double radius;


  public Circle(double r) {
      radius = r;
  }

  public double getArea() {
      return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double w, double h) {
      width = w;
      height = h;
  }

  public double getArea() {
      return width * height;
  }
}


public class Mains {
  public static void main(String[] args) {

      Circle c = new Circle(2);
    
      Rectangle r = new Rectangle(3, 4);


      System.out.println("Area of Circle: " + c.getArea());
      System.out.println("Area of Rectangle: " + r.getArea());
  }
}
