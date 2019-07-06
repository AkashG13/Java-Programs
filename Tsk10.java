/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk10;

import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p = 0;
  Scanner s=new Scanner(System.in);
    System.out.println("Enter No. ");
int n=s.nextInt();
    for(int a=1;a<=n;a++)
    {     //p=a*a*a;
  System.out.println("No is: "+a+" Cube is: "+(a*a*a));  }
      
    }
    }