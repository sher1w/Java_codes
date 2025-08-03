
import java.util.*;

public class JavaApplication52 {
     
    public static void main(String[] args) {
        
class ABC {
    private  int a, b;

    void getdata() {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 values");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    
    int returna()
    {
        return a;
    }
    
    int returnb()
    {
        return b ;
    }   
         
    
}

class DCF extends ABC {


    void calculate( int a , int b ) {
        int c = a + b;
        System.out.println("sum -> " + c);
    }
        }



 

        DCF d = new DCF();
        d.getdata();
       int  a = d.returna();
        int b = d.returnb();
     
        d.calculate(a , b );
    }
}