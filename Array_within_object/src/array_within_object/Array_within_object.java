/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_within_object;
import java.util.Scanner;
/**
 *
 * @author Me
 */
public class Array_within_object {

    private    int[] itemcode =new int[10];
    private  int[] itemprice = new int[10];
    private int i ;
    int total=0;

Scanner sc = new Scanner(System.in);


void display()
{
    for(i =0 ; i< c;i++){ 
        System.out.print(itemcode[i]+"          ");
        System.out.println(itemprice[i]);
    }
}





int c ;


void Sum()
{total = 0  ;
    for( i =0 ;i < c ;i++)
    {
        total = total + itemprice[i];
    }
    
System.out.println("The suum is "+total);
}





void Linearsearch(int x )
{
    for(i = 0 ; i < c ; i++)
    {
        if(itemcode[i] == x)
        {
            itemprice[i]=0;
            return ;
        }
    }
    System.out.println("No such item code present ");
}

void getdata()
{
   
    System.out.println("Enter itemcode ");
    itemcode[i]=sc.nextInt();
      System.out.println("Enter itemprice ");
    itemprice[i]=sc.nextInt();
     i++;
     c = i ;
}
    

    public static void main(String[] args)
    {int  k = 0, j= 0 ;
       Array_within_object ao = new Array_within_object();      
Scanner sc = new Scanner(System.in);

int choice;
do{
    
System.out.println("OPTIONS");
System.out.println("1.Enter 1 to insert itemcode and itemprice");
System.out.println("2.Enter 2 to display  Sum of Prices");
System.out.println("3.Enter  3 to display all details");
System.out.println("4. Enter 4 to remove itemprice based on itemcode");
choice = sc.nextInt();

switch (choice)
{ 
    case 1:
       
    ao.getdata();
      
    break;
    case 2:
        ao.Sum();
       
    break;
    case 3:
      System.out.print("Itemcode    ItemPrice");
      System.out.print("\n");
       
    ao.display();
        
    break;
    case 4:
    System.out.println("Enter item code ");
   int x = sc.nextInt();
   ao.Linearsearch(x);
        break;
        
    default:
        break;
}
}
while(choice!=0);

        // TODO code application logic here
    }
    
}
