/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sjcet
 */
import java.util.*;
public class Areaoverloading 
{  
   static final double PI=Math.PI;
   Scanner sc=new Scanner(System.in);
    public void area(int s)
    {
       System.out.print("Enter the value of s:");
       s=sc.nextInt();
       System.out.println("Area of square is:"+s*s);
    }
    public void area(int l,int b)
    {   
        System.out.print("Enter the value for l and b:");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Area of rectangle is:"+l*b);
    }
    public void area(double r)
    {   
        
        System.out.print("Enter the value for r:");
        r=sc.nextDouble();
        System.out.println("Area of circle is:"+PI*r*r);
    }
    public static void main(String args[])
    {
        Areaoverloading ob=new Areaoverloading();
        ob.area(0);
        ob.area(0, 0);
        ob.area(0.00);
    }
    
}
