/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buffer;
import java.io.*;
/**
 *
 * @author Me
 */
public class Buffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String args []) 
     throws IOException 
    {
        FileInputStream file1 ;
        FileInputStream file2  ;
        SequenceInputStream file3 ;
        
        file1 = new FileInputStream ("C:\\Users\\Me\\Desktop\\Applets\\text1.dat");
        file2 = new FileInputStream("C:\\Users\\Me\\Desktop\\Applets\\text2.dat");
        
        file3 = new SequenceInputStream (file1, file2);
        
        BufferedInputStream inBuffer = new BufferedInputStream (file3);
        BufferedOutputStream outBuffer = new BufferedOutputStream (System.out);
        int ch;
        while( ( ch =inBuffer.read()) != -1)
        {
            outBuffer.write( (char) ch);
        }
        inBuffer.close();
        outBuffer.close();
        file1.close();
        file2.close();
        // TODO code application logic here
    }
    
}
