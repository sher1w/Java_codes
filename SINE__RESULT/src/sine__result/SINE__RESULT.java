/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sine__result;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class SINE__RESULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n, degree;
        float sum = 0;
        float term ;
        float Nterm ;
        int a = 1;
        double temp = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        n = sc.nextInt();
        System.out.println("Enter the value of X in degree ");
        degree = sc.nextInt();
        float Radian = (float) ((degree) * (3.141592)) / 180;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                temp = j * temp;
            }

            Nterm = (float) Math.pow(Radian, a);
            a = a + 2;
            term = (float) (Nterm / temp);
            if (i % 2 == 1) {
                term = -term;
            } else {
                term = (float)term;
            }
            sum = term + sum;
        }zxcv
        System.out.println("The SIN(x) series sum is " + sum);
    }
    
}
