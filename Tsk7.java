/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk7;

import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of rows of array: ");
        a=s.nextInt();
        System.out.println("Enter no. of column of array: ");
        b=s.nextInt();
        int arry1[][] = new int[a][b];
  int arry2[][] = new int[a][b];
  int sum[][]=new int[a][b];
  System.out.println("Enter elements of 1st matrix: ");
  for(c=0;c<a;c++){
      for(d=0;d<b;d++){
          arry1[c][d]=s.nextInt();
      }
  }System.out.println("Enter elements of 2nd matrix: ");
   for(c=0;c<a;c++){
      for(d=0;d<b;d++){
          arry2[c][d]=s.nextInt();
      }
  }
   for(c=0;c<a;c++){
      for(d=0;d<b;d++){
          sum[c][d]=arry1[c][d]+arry2[c][d];
      }
  }
   System.out.println("Sum of the matrices: ");
   for(c=0;c<a;c++){
      for(d=0;d<b;d++){
          System.out.print(sum[c][d]+"\t");
          
      }System.out.println();
  }
   
   
    }
    
}
