/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

package javaapplication45;


class Time {
    private int min;
    private int hr;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for time in hours and minutes");
        hr = sc.nextInt();
        min = sc.nextInt();
    }

    void display() {
        System.out.println("The total time is " + hr + " Hours " + min + " Minutes");
    }

    void addtime(Time t1, Time t2) {
        hr = 0 ;
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr;
        hr = hr + (min / 60);
        min = min % 60;
    }
}

public class JavaApplication45 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.getdata();
        t2.getdata();
        t3.addtime(t1, t2);
        t3.display();
    }
}
