import java.awt.*;
import java.applet.*;

public class LineRect extends Applet{
public void paint(Graphics g )
{
g.fillRect(60, 10, 30, 80);
g.drawLine(10, 10, 50, 50);
g.drawRect(10, 60, 40, 30);
g.drawRoundRect(100, 100, 80, 50, 50, 50);
g.fillRoundRect(20, 110, 60, 30, 50, 50);
g.drawOval(200,200, 100,100);
g.setColor(Clor.green);
g.fillOval(250,250, 10, 10);
}
}