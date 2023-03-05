import java.util.Scanner;
import java.io.*;
public class pali
{
public static void main(String args[])
{
int x=0,num,rev=0,y;
Scanner s =new Scanner(System.in);
System.out.println("ENTER A NUMBER?");
num=s.nextInt();
y=num;
while(num>0)
{
x=num%10;
num=num/10;
rev=rev*10+x;
}
if(rev==y)
{
System.out.println("NUMBER IS PALINDROME🤑️");
}
else
{
System.out.println("NUMBER IS NOT PALINDROME😭️");
}
}
}
