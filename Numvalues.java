import java.applet.*;
import java.awt.*;

public class Numvalues extends Applet
{
public void paint(Graphics g)
{
int v =10;
int t = 20;
int s = v + t ;
String sg= "sum->" + String.valueOf(s);
g.drawString( sg, 100, 100);
}
} 