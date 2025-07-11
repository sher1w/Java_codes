   import java.applet.*;
   import java.awt.*;
   public class even_odd extends Applet{
   public void paint(Graphics g )
   {
int a , b, c , d;
b = 50;
   int i = 0 ;
     g.setColor(Color.pink);
b=100;   

  while(i < 3)
   {


   if(i%2==0)
   {
   g.setColor(Color.green);
g.drawOval(100,b,75,75);
 g.fillOval(200,b,75,75);
g.drawOval(300,b,75,75);
b= b + 250; 

   }
   else
   {
  g.fillOval(100,b,75,75);
g.drawOval(200,b,75,75);
  g.fillOval(300,b,75,75);
b= b + 250;

    }
     i++;}
    }
}