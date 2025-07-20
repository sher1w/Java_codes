/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;


/**
 *
 * @author Me
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Sum , A , B ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value");
        A=sc.nextInt();
        System.out.println("Enter the second value");
        B=sc.nextInt();
        Sum=A+B;
        System.out.println("The sum is "+Sum);
        System.out.println("The sum of "+A+"and"+B+"="+Sum);
        // TODO code application logic here
    }
    
}
