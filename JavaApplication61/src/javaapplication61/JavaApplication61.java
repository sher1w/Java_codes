
import java.io.*;

/** *
 * @author Me
 */
public class JavaApplication61 
{
    public static void main( String args [] ) throws IOException
    {
    File primitive = new File ("prime.dat") ;
    FileOutputStream fos = new FileOutputStream  (primitive) ;
    DataOutputStream dos = new DataOutputStream (fos);
    
    dos.writeInt (1993) ;
    dos.writeDouble (23.345) ;
    dos.writeBoolean (false) ;
    dos.writeChar ('X') ;
    dos.close();
    fos.close();
    
    FileInputStream fis = new FileInputStream (primitive) ;
    DataInputStream   dis  = new DataInputStream  (fis);
    
    System.out.println ( dis.readInt( ) );
    System.out.println (dis.readDouble( ) );
    System.out.println (dis.readBoolean());
    System.out.println (dis.readChar( ));
    dis.close();
    fis.close();
        // TODO code application logic here
    }
    
}
