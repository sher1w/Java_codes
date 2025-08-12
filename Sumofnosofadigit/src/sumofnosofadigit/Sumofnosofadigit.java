/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofnosofadigit;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class Sumofnosofadigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int no ,num , temp;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number ");
        no = sc.nextInt();
        num = no;
        temp = 0;
        while(num> 0 )
        {
            
         temp = num%10 + temp;
         num= num /10;
        }
        
        System.out.println("The answer is " +temp);
        // TODO code application logic here
    }
    
}
