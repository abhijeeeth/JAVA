import java.io.*;
import java.util.Scanner;
interface studdata
{
    public void display();
}
    class student implements studdata
    {
        String sname;
        int m[] = new int[5];
        double tot,per;
        int i;
        student(String s,int a[])
        {
                sname=s;
                for(i=0;i<5;i++)
                {
                    m[i]=a[i];
                }
        }
        void calculate()
        {
            for(i=0;i<5;i++)
            {
                tot=tot+m[i];
            }
            per=(tot/500)*100;
        }
        public void display()
        {
            System.out.println("name="+sname);
            System.out.println("total="+tot);
            System.out.println("per="+per);
        }
    }
    class stumain
    {
        public static void main(String A[])
        {
            String sname;
            int m[] = new int[5];
            int i;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the name");
            sname=s.next();
            System.out.println("Enter Five MArks");
            for(i=0;i<5;i++)
                {
                    m[i]=s.nextInt();
                }
            student st=new student(sname,m);
            st.calculate();
            st.display();
        }
    }