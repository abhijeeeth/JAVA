
import java.io.*;
public class FunctionOverloadin {

    public static void main(String[] args) {
      int x = 5;
      int y = 10;
      double a = 2.5;
      double b = 3.0;
      
      System.out.println("Addition of two integers: " + add(x, y));
      System.out.println("Addition of two doubles: " + add(a, b));
      System.out.println("Addition of an integer and a double: " + add(x, a));
    }
  
    public static int add(int num1, int num2) {
      return num1 + num2;
    }
  
    public static double add(double num1, double num2) {
      return num1 + num2;
    }
  
    public static double add(int num1, double num2) {
      return num1 + num2;
    }
  }
  