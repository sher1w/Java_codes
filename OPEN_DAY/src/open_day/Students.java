// File: open_day/Students.java
package open_day;

import java.util.Scanner;
import INTERFACE_PART.SPORTS;

public class Students {

    // Single Scanner instance
    private Scanner sc = new Scanner(System.in);

    public class Student {
        private String name;
        private int roll;

        public void getData() {
            System.out.print("Enter Name: ");
            name = sc.next();
            System.out.print("Enter Roll No: ");
            roll = sc.nextInt();
        }

        public void displayData() {
            System.out.println("The student roll-no is: " + roll);
            System.out.println("Name: " + name);
        }
    }

    public class Marks extends Student {
        private int[] marks = new int[5];

        public void getMarks() {
            System.out.println("Enter marks for 5 subjects:");
            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextInt();
            }
        }

        public void displayMarks() {
            System.out.print("The marks for 5 subjects are: ");
            for (int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }

        // Getter methods for marks
        int[] getMarksArray() {
            return marks;
        }
    }

    public class Results extends Marks implements SPORTS {
        private int total;
        private float percentage;

        @Override
        public int getSportsMarks() {
            return 50;
            
        }

        static int sp = 50;
        public void calculate() {
            int spMarks = getSportsMarks();
            int[] subjectMarks = getMarksArray();
            total = spMarks43
            for (int mark : subjectMarks) {
                total += mark;
            }
            percentage = (float) total / 6; // Assuming 5 subjects + sports
        }

        @Override
        public void displaySports() {
            System.out.println("Sports marks: " + sp);
        }

        public  void displayAll() {
            displaySports();
            System.out.println("Percentage: " + percentage);
            System.out.println("Total: " + total);
            displayMarks();
            displayData();
        }
    }
}
