import java.awt.*;
import java.applet.*;
public class HelloPara extends Applet
{
String str;
 
public void init()
{
str = getParameter("string");
if(str == null)
str ="JAVA";
str= "Hello" + str ;
}
public void paint (Graphics g)
{
g.drawString( str, 100, 10);
}

}