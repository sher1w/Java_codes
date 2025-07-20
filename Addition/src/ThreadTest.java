/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Me
 */
class A extends Thread
{
    public void run()
    {
        for(int i = 1 ;i < 50;i++)
        {
          
            System.out.println(" A Thread "+i);
        }
        System.out.println("Exiting A");
            }

}

    
    
    class B extends Thread 
    { public void run()
        {
        for(int i = 0 ;i <50 ;i++)
        {
            System.out.println(" B Thread "+ i);
         
        }
        
        System.out.println("Exiting B");
    }
    }
    class C extends Thread 
    { public void run()
        {
        for(int i = 0 ;i <50 ;i++)
        {
            System.out.println(" C Thread "+ i);
          
        }
              System.out.println("Exiting c");
    }
    }
public class ThreadTest {
    
    public static void main(String args [])
    {
A threadA = new A();
B threadB = new B();
C threadC = new C();

threadC.setPriority(Thread.MAX_PRIORITY);
threadB.setPriority(threadA.getPriority( )+1);
threadA.setPriority(Thread.MIN_PRIORITY);

System.out.println("Start thread A");
threadA.start();
System.out.println("Start thread B");
threadB.start();
System.out.println("Start thread C");
threadC.start();

    }
}
