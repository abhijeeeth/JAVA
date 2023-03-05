import java.util.*;
	class Complex
		{
		int rl;
		int img;
			Complex(int rl,int img)
				{
				this.rl=rl;
				this.img=img;
				}
				Complex add(Complex c)
					{
					return new Complex(rl+c.rl,img+c.img);
					}
				Complex subtract(Complex c)
					{
					return new Complex(rl-c.rl,img-c.img);
					}
				Complex multiply(Complex c)
					{
					int newRl=rl*c.rl-img*c.rl;
					int newImg=rl*c.img+img*c.rl;
					return new Complex(newRl,newImg);
					}
			public static void main(String a[])
				{
				Scanner s=new Scanner(System.in);
				System.out.println("FIRST complex");
				Complex c1=new Complex(s.nextInt(),s.nextInt());
				System.out.println("Second complex");
				Complex c2=new Complex(s.nextInt(),s.nextInt());

				Complex c_sum=c1.add(c2);
				Complex c_diff=c1.subtract(c2);
				Complex c_prod=c1.multiply(c2);
	System.out.println("Sum :" + c_sum.rl + "+" + c_sum.img + "i");
	System.out.println("Difference" + c_diff.rl +  "+" + c_diff.img + "i");
	System.out.println("Product" + c_prod.rl + "+" + c_prod.img + "i");
				}
		}


















