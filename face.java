import java.applet.*;
import java.awt.*;
/*

<applet code = yell.class width=500 height=500>

</applet>

*/

public class yell extends Applet
{ 
   public void paint()
{
	 setBackground(Color.red);
      }
	 public void paint(Graphics g) 

    { 
        Color clr=new Color(255,179,86);

        g.setColor(clr);

        g.drawOval(100,100,250,300);

        g.fillOval(100,100,250,300);

   	g.setColor(Color.black);

        g.drawOval(160,185,40,25);

        g.fillOval(160,185,40,25);

        g.drawOval(250,185,40,25);

        g.fillOval(250,185,40,25);

        g.drawArc(160,170,35,10,0,180);

        g.drawArc(250,170,35,10,0,180);

        g.drawLine(210,265,210,275);

        g.drawLine(240,265,240,275);

        g.drawArc(210,275,30,10,0,-180); 

        g.drawArc(175,300,100,50,0,-180);
	
 } 
} 


