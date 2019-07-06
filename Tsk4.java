/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk4;

import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
float a,b=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter no. to be converted in inch: ");
a=s.nextFloat();
b=(float) (a*0.0254);
System.out.println(a+"inch ="+b+(" metres"));

    }
    
}
