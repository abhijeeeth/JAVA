import java.awt.*;
import java.applet.*;
/*<applet code="flag1.class" width=400 height=600> </applet> */
public class Flag1 extends Applet {
    
    public void paint(Graphics g)
     {

        setBackground(Color.white);

        g.setColor(Color.orange);
        g.fillRect(100, 100, 200, 50);
        g.setColor(Color.white);
        g.fillRect(100, 150, 200, 50);
        g.setColor(Color.green);
        g.fillRect(100, 200, 200, 280);

        g.setColor(Color.blue);
        g.fillOval(175, 150, 50, 50);
        g.setColor(Color.white);
        g.drawLine(200, 158, 200, 200);
        g.drawLine(175, 175, 225, 175);
        g.drawLine(200, 175, 200, 225);

        g.setColor(Color.black);
        g.fillRect(90, 100, 20, 400);
    }
}
