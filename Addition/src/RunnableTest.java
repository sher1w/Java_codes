/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Me
 */

        class X implements Runnable
        {
        public void run()
        {
        for(int i = 1 ;i <=10 ;i++)
        {
        System.out.println("Thread "+i);
        }
        System.out.println("End of Thread X");
        }
        }




public class RunnableTest 
    {   
    public static void main(String args[])
    {
    X runner = new X();
    Thread threadX = new Thread(runner);
    threadX.start( );
    System.out.println("End of main thread");
    }
    }
