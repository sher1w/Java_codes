/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
          package class_and_obj;
          import java.util.Scanner;
            class Student 
            {
            private String name;
            private int age , Rollno ;
            void getdata()
            {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name");
            name = sc.next();
            System.out.println("Enter your age");
            age = sc.nextInt();
            System.out.println("Enter your Roll no");
            Rollno = sc.nextInt();
            }
            
    void putdata()
    {
    System.out.println("Your name is "+name);
    System.out.println("Your age is "+age);
    System.out.println("Your Roll no is "+Rollno);
    }
    }
/**
 *
 * @author Me
 */
     public class CLASS_and_Obj {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Student st =new  Student ();
        st.getdata();
        st.putdata();
        // TODO code application logic here
        }
        }
