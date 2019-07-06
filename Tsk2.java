/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk2;

import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter 1st binary ");
String x=sc.nextLine();
   System.out.println("Enter 2nd binary ");
   String y=sc.nextLine();
   int n1=Integer.parseInt(x,2);
   int n2=Integer.parseInt(y,2);
   int n3=n1+n2;
   System.out.println("n1:"+Integer.toBinaryString(n1));
   System.out.println("n2:"+Integer.toBinaryString(n2));   
   System.out.println("n3:"+Integer.toBinaryString(n3));   
    }
    
}
