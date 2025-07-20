/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Me
 */
import java.io.*;

public class Bytes
{
public static void main( String args[] )
{
 byte Cities[] = {'D', 'E', 'L', 'H', 'I', '\n', 'M', 'A', 'S', 'A', 'S', 'S', '\n', 'L', 'O', 'N', 'D', 'O', 'N', '\n'};
FileOutputStream outfile;

try
{
    outfile  = new FileOutputStream("city.txt");
    outfile.write (Cities);
    outfile.close();
}
catch (IOException ioe)
{
    System.out.println (ioe);
    System.exit (-1);
}

FileInputStream infile;
int  b ;

try
{
    infile =new FileInputStream("city.txt");
    while( ( b = infile.read( )) != -1)
    {
        System.out.println( (char ) b );
    }
    infile.close();
}
catch( IOException ioe)
{
    System.out.println(ioe);
}

}

}
