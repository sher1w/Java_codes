/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileran;
import java.io.*;
/**
 *
 * @author Me
 */
public class Fileran {

    /**
     * @param args the command line arguments
     */
    public static void main(String args []) 
    {
    RandomAccessFile file  = null ;
    
    try
    {
    file = new RandomAccessFile ("rand.dat", "rw");
    file.writeChar('X');
    file.writeInt(303);
    file.writeDouble(333.444);
    file.seek (0);

   System.out.println(file.readChar () );
   System.out.println(file.readInt());
   System.out.println(file.readDouble());

   file.seek(2);
   System.out.println (file.readInt () );

        long l = file.length();

    file.seek(l);// TODO code application logic here
    file.writeBoolean(false);
    file.seek(4);
    System.out.println(file.readBoolean());
    file.close();
    
    }
    catch ( IOException e){ System.out.println (e) ;}
    
}
}