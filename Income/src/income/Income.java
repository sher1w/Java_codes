/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;


/**
 *
 * @author Me
 */
public class Income {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int Income ;
    float Tax , Amt;
    Scanner  sc  = new Scanner (System.in);
    System.out.println("Enter Salary ");
    Income = sc.nextInt();
    if(Income > 250000)
    {
        Amt = Income - 250000;
    Tax=25000+ Amt/100 * 30;
    System.out.println("RS"+" "+Tax+"has to be payed ");
       
        // TODO code application logic here
    
    }else if(Income >100000 && Income<=150000 )
    {
        Amt = Income - 100000;
    Tax=(float)Amt/100 * 10;
    System.out.println("RS"+" "+Tax+"has to be payed ");    
    } 
    else if(Income > 150000 && Income < 250000 )
    {   Amt = Income - 150000;
        Tax=5000+ Amt/100 *20;
        System.out.println("RS"+" "+Tax+"has to be payed ");
    }else
    {   
         System.out.println("No Tax");
      }
      }}