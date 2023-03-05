import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sample extends JFrame implements ItemListener
{
JLabel l1,l2;
JRadioButton r1,r2,r3;
JTextField t1,t2;
ButtonGroup bg;
Container con;
	sample()
	{
		super("Abhijith SHaji");
		con=getContentPane();
		con.setLayout(new FlowLayout());
	l1=new JLabel("ENter the number");
	l2=new JLabel("ENter the number");
	bg=new ButtonGroup();
	r1=new JRadioButton("reverse");
	r2=new JRadioButton("sum");
	r3=new JRadioButton("palindrome");
	t1=new JTextField(20);
	t2=new JTextField(20);
	r1.addItemListener(this);
	r2.addItemListener(this);
	r3.addItemListener(this);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		con.add(l1);
		con.add(t1);
		con.add(r1);
		con.add(r2);
		con.add(r3);
		con.add(l2);
		con.add(t2);
			addWindowListener(new WindowAdapter()
				{
				public void WindowClosing(WindowEvent e)
				{
					System.exit(0);
				}
				});
	}
		public void itemStateChanged(ItemEvent e)
		{
		int n,r,rev=0,sum=0,temp=0;
		n=Integer.parseInt(t1.getText());
			if(r1.isSelected())
				{
				while(n>0)
					{
					r=n%10;
					rev=(rev*10)+r;
					n=n/10;
					}
					t2.setText(String.valueOf(rev));
				}
			if(r2.isSelected())
				{
				while(n>0)
					{
					r=n%10;
					sum=sum+r;
					n=n/10;
					}
					t2.setText(String.valueOf(sum));
				}
			if(r3.isSelected())
				{
					temp=n;
				while(n>0)
					{
					r=n%10;
					rev=(rev*10)+r;
					n=n/10;
					}
					if(temp==rev)
					{
					t2.setText(String.valueOf("Palindrome"));
					}
					else
					{
					t2.setText(String.valueOf("Not Palindrome"));
					}											
				}
			}
}
				class bonka
					{
					public static void main(String a[])
						{
							sample s=new sample();
							s.setSize(500,800);
							s.setVisible(true);
						}
					}










