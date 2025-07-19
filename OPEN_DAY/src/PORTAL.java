/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import OPEN_DAY.*;
import open_day.Students;
import open_day.Students.Results;
/**
 *
 * @author Me
 */
public class PORTAL {
    
    public static void  main( String [] args)
    {
     Students outer = new Students();
        Results result = outer.new Results();
        
        result.getData();
        result.getMarks();
        result.calculate();
        result.displayAll();
    
    }
    
}
