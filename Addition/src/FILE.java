/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MeC
 */

import java.io.*;
class  FILE 
{
    public static void main(String args[])
    {
        File inFile  = new File("C:\\Users\\Me\\Desktop\\Applets\\file.txt");
        File outFile = new File("C:\\Users\\Me\\Desktop\\Applets\\filecopied.txt");
        FileReader ins = null;
        FileWriter outs = null;
        try
        {
            ins = new FileReader(inFile);
            outs = new FileWriter(outFile);
            
            int ch ;
            while (  (ch = ins.read( ) ) != - 1 )
            {
                outs.write (ch);
            }
            
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit( - 1 );
        }
        finally
        {
            try
            {
                ins.close ( ) ;
                outs.close (  ) ;
            }
            catch( IOException  e ) { }
        }
    }
}
