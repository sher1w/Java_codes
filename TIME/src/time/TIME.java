/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class TIME {
    private int hr, min;

    TIME(TIME t, TIME t2) {
        hr = t.hr + t2.hr;
        min = t.min + t2.min;
        hr = min / 60 + hr;
        min=  min%60;
        
    }

    TIME(int x, int y) {
        hr = x;
        min = y;
    }

    void display() {
        System.out.println("hrs-> " + hr);
        System.out.println("Min-> " + min);
    }

    public static void main(String[] args) {
        int hour, minute;
        System.out.println("Enter time in hours and minutes");
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        minute = sc.nextInt();
        TIME t = new TIME(hour, minute);

        System.out.println("Enter time in hours and minutes");
        hour = sc.nextInt();
        minute = sc.nextInt();
        TIME t2 = new TIME(hour, minute);

        TIME t3 = new TIME(t, t2);
        t3.display();
    }
}