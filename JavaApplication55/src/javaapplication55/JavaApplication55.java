package javaapplication55;
import java.util.*;

public class JavaApplication55 {
 Scanner sc = new Scanner(System.in);
       interface  sports
        {  public int spmarks = 50 ;
        void display_s();
        }

   class Student
        { 
            private String nam;
          
            private int roll;
            
            void getdata()
            {
           System.out.println("Enter Name ");
           nam = sc.next();
           
           System.out.println("Enter roll no ");
           roll = sc.nextInt();
        
            }
             void display_data()    
            {
                System.out.println("The student roll-no is"+ roll);
                System.out.println("Name:"+nam);
            }
        }

   class marks extends Student
        {
            private int  m1, m2, m3, m4 , m5 ;
            void get_marks()
            {
                System.out.println("Enter marks for 5 Subjects");
                      m1 = sc.nextInt();
                      m2 = sc.nextInt();   
                      m3 = sc.nextInt();     
                      m4 = sc.nextInt();  
                      m5 = sc.nextInt();
     
            }
    int returnm1()
    {
        return m1;
    }            
    
    int returnm2()
    {
        return m2;
    }  
     
    int returnm3()
    {
        return m3;
    }  
    
    int returnm4()
    {
        return m4;
    }  
    
    int returnm5()
    {
        return m5;
    }  
            void display_marks()
            {
                System.out.println("The marks for 5 Subjects are "+" "+m1+" "+m2+" "+m3+" "+m4+" "+m5);
            }
        }

     class results extends marks  implements sports
        {
            private int total ;
            private float percentage;
            void cal(int m1,int m2,int m3,int m4,int m5 )
            {
             percentage =(m1+m2+m3+m4+m5+spmarks)/6;
             total= m1+m2+m3+m4+m5+spmarks;     
            }
            
            public void display_s()
            {
                System.out.println("Sports marks"+spmarks);
            }
            
            void display_all()
            {display_s();
                System.out.println("Percentage: "+ percentage);
                System.out.println("Total: "+ total);
               display_marks();
                display_data();          
         } 
        }

    public static void main(String[] args)
    
    {
        
        results r = new results();
        r.getdata();
        
      int a , b , c , d , e;
        r.get_marks();
      a = r.returnm1();
      b = r.returnm2();
    c = r.returnm3();
     d = r.returnm4();
      e = r.returnm5();
        r.cal(a ,  b , c ,  d ,  e);
        
      
        System.out.println("Student-info");
        r.display_all();
    }
    
    
}
