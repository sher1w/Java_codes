     import java.awt.*;
     import java.applet.*;

   public class User extends Applet
   {
   TextField  t1, t2;

    public void init()
    {
    t1 = new TextField(8);
    t2 = new TextField(8);
    add ( t1);
    add ( t2);
    t1.setText ("0");
    t2.setText ("0");
    }

   public void paint (Graphics g) 
   {
   int x= 0, y = 0 , z =0 ;
   String s1, s2, s3, s ;
   g.drawString("INPUT 2 NOS", 10, 10);
  
   try
   {
   s1= t1.getText();
   x = Integer.parseInt(s1);
   s2= t2.getText();
   y =Integer.parseInt(s2);
   }

   catch(Exception e)
   {}
   z = x + y ; 
   s = String.valueOf(z);
   g.drawString("SUM - >",200,100);
   g.drawString(s,300,100);
   }

 /*  public boolean action(Event event, Object obj)
   {
   repaint();
   return true; 
   }
 */
   }
