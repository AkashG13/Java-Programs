/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk.pkg5;

import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
    long calc=525600;
    Scanner sc= new Scanner(System.in);
    long min;
    min=sc.nextLong();
    long year=(long)min/calc;
    int days=(int)(min/60/24)%365;
    System.out.println(min+" ="+year+" "+days);
    
    }
    
}
