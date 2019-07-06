/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk6;

import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter No.");
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        if(a>=0)
        {System.out.println(a+" is Possitive");}
        else 
        {System.out.println(a+" is Negative");
        }     // TODO code application logic here
    }
    
}
