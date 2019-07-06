/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsk8;
import java.util.Scanner;

/**
 *
 * @author AKASH
 */
public class Tsk8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String word=new String();
  Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
System.out.print("Number of  Vowels in the string: " + countvowls(str)+"\n");
    }
    public static int countvowls(String str)
            {int c=0;
     for (int i = 0; i <= str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                c++;
            }
        }
        return c;
            }
}