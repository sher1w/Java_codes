import java.awt.*;
import java.applet.*;

public class Poly extends Applet
{
int x[ ] ={20, 120 , 220 , 20};
int y[]={20, 120, 20, 20};
int n1 = 4;
int x2[]={120,220,220,120};
int y2[]={120,20,220,120};
int n2 = 4 ;
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillPolygon(x, y, n1);
g.setColor(Color.green);
g.fillPolygon(x2, y2, n2);

}
}
