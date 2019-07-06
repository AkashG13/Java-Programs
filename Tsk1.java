/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk1;

import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Scanner io = new Scanner(System.in);
  System.out.println("Input the radius of the circle: ");
  double radius = io.nextDouble();
  System.out.println("Perimeter is = " + (2 * radius * Math.PI));
  System.out.println("Area is = " + (Math.PI * radius * radius));


    }
    
}
