import java.awt.*;
import java.applet.*;
public class Face extends Applet
{

public void paint( Graphics g)
{
g.drawOval(40, 40, 200, 180);
g.drawOval(97, 75, 39, 20);
g.drawOval(150,75,30,20);
g.drawOval(125, 100, 30, 30);
g.drawOval(25, 92, 15, 30);
g.drawOval(240, 92, 15, 30);
g.setColor(Color.blue);
g.fillOval(108, 81, 10, 10);
g.fillOval(161, 81, 10, 10);
g.setColor(Color.red);
g.fillArc(100,125,80,40,180,180);

}
}