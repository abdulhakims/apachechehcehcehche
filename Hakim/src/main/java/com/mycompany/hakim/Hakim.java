/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hakim;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Hakim {

    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a numebr!");
       int x = input.nextInt();
        System.out.println("Enter another numebr!");
        int y = input.nextInt();
        
        int s,p,d,q;
        s = x + y ;
        d = x - y ;
        p = x * y ;
        q = x / y ;
        
        
        System.out.println("the sum of 2 number :" + s);
        System.out.println("the diff of 2 number :" + d);
        System.out.println("the product of 2 number :" + p);
        System.out.println("the quot of 2 number :" + q);
    }
}
