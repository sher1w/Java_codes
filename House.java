import java.applet.*;
import java.awt.*;

public class House extends Applet {

    public void paint(Graphics g) {
       
        g.setColor(Color.pink);
        g.fillRect(202, 250, 400, 300); 
  int xPoints[] = { 202, 400, 600, 202};

     
int yPoints[] = { 250, 100, 250 , 250};
int npoints = xPoints.length;

        g.setColor(Color.red);
Polygon poly =new Polygon( xPoints, yPoints, npoints);
g.fillPolygon(poly);

    //    g.drawLine(202, 250, 400, 100); 
//        g.drawLine(400, 100, 600, 250); 


        g.setColor(Color.blue);
        g.fillRect(250, 300, 80, 80); 

        g.fillRect(470, 300, 80, 80); 

        g.setColor(Color.purple);
        g.fillRect(360, 450, 80, 100); 
        g.setColor(Color.yellow);
        g.fillOval(380, 150, 40, 40); 
        }
}