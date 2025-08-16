

import java.util.Scanner;


/**
 *
 * @author Me
 */
    public class FIXEDSEPOSIT {
    private  float  mv  ;
    private  float r  ;
        private float principal, years ;
    FIXEDSEPOSIT(int P , int Y, int R)
    {  years =Y;
    mv =P;
    r = R;
        for(int i =0 ; i < years ;i++)
        {
            mv = (float) (1+r *0.01)* mv   ;
        }
    }
    
    FIXEDSEPOSIT(int P , int Y  )
    {   years =Y;
        mv =P;  
        r  = (float) 0.12;
        for(int i =0 ;i < years ;i++)
        {
            mv =mv *(1 +r);
        }
    }
    
   void  Display()
    {
        System.out.println("The return is  "+mv);
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        
    int P, Y ,R ;
    float r;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  the principal , year , rate  ");
    P = sc.nextInt();
    Y=sc.nextInt();
    R=sc.nextInt();
    FIXEDSEPOSIT T1 = new FIXEDSEPOSIT( P , Y , R);
    T1.Display();
     System.out.println("Enter  the principal and year   ");
    P = sc.nextInt();
    Y=sc.nextInt();
    FIXEDSEPOSIT T2 = new FIXEDSEPOSIT( P , Y );
    T2.Display();
    }
    
}
