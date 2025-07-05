/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication62;
import java.io.*;

/**
 *
 * @author Me
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args [])
    {
        DataInputStream dis =  null;
        DataOutputStream dos = null;
        
        File floatFile = new File ("rand.dat");
        
        try 
        {
            dos = new DataOutputStream(new FileOutputStream (floatFile));
            for(int i = 0 ; i< 20 ; i++)
                dos.writeFloat( (float) (Math.random () * 100));
        }
        catch( IOException ioe )
        {
            System.out.println(ioe.getMessage());   
        }
        finally
        {
            try
            {
                dos.close();
            }
            catch(IOException ioe ){ }
        }
        
        
        try 
        {
        dis = new DataInputStream(new FileInputStream (floatFile));
        for(int i = 0 ;i < 20 ;i++)
        {
        float n = dis.readInt();
        System.out.print (n + " "); }
        }
        catch(IOException ioe)
        {
            System.out.println( ioe.getMessage() );    
        }finally
        {
            try
            {dis.close  ();
        
        }
            catch(IOException ioe) {}
        // TODO code application logic here
    }
    }
}
