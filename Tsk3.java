/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk3;

import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        System.out.println("Enter Number: ");
 Scanner s=new Scanner(System.in);
 int sum=0;
 int m,n;
 m=s.nextInt();
 while(m>0)
 {n=m%10;
 sum=sum+n;
 m=m/10;
 }
 System.out.println("Addition is:"+sum);
    }
    
}
