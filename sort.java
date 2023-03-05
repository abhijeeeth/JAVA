import java.io.*;
import java.util.Scanner;
class sort
{
public static void main(String args[])
{
int a[]=new int[20];
int i,j,n,temp;
System.out.println("enter the size😑️");
Scanner S=new Scanner(System.in);
n=S.nextInt();
System.out.println("Enter Array😎️");
for(i=0;i<n;i++)
{
a[i]=S.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
System.out.println("Sorted is👻️");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
}
}
