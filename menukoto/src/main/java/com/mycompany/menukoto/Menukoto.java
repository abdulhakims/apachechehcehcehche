/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menukoto;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Menukoto {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("*********************");
        System.out.println("*     MENUKOTO      *");
        System.out.println("*                   *");
        System.out.println("* [A]Pinoy Merienda *");
        System.out.println("* [B]Drinks         *");
        System.out.println("*                   *");
        System.out.println("*********************");
         System.out.println("Enter your choice:");
        char x = input.nextLine().charAt(0);
                
      if (x=='a'||x=='A')
      {
      System.out.println("MENUKOTO");
      System.out.println("  LIST  ");
      System.out.println("  ");
      System.out.println("  Pan De Sal  ");
      System.out.println("  Kakanin ");
      System.out.println("  Bibingka  ");
      System.out.println("  Pancit Palabok  ");
      System.out.println("  Banana Cue  ");
      System.out.println("  Bilo Bilo "); 
      }
      else if(x=='b'||x=='B')
      {
      System.out.println("MENUKOTO");
      System.out.println("  LIST  ");
      System.out.println("   ");
      System.out.println(" Calamansi Juice ");
      System.out.println(" Chocolate Juice  ");
      System.out.println(" Sago't Gulaman ");
      System.out.println(" Nestea  ");
      System.out.println(" Mango Juice  ");
      System.out.println(" Orange Juice  "); 
      }
      
      else
      {
      System.out.println("  PLEASE SEE THE MENU  ");
      }
              
    }

}