import java.util.*;
public class minmax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
System.out.println("Enter total no. of elements");
int n=sc.nextInt();
System.out.println("Enter element in array");
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(arr[i]<min)
{
min=arr[i];
}
if(arr[i]>max)
{
max=arr[i];
}
}
System.out.println("maximum element is "+max);
System.out.println("minimum element is "+min);
}
}
