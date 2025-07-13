/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.snaksndrenks;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Snaksndrenks {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("[1] Snacks ");
        System.out.println("[2] Drinks ");
        
        System.out.println("Enter Your Choice: ");
        int x = input.nextInt();   
        
        if (x==1)
        {
            
        System.out.println("[1] cheezy       ");
        System.out.println("[2] adobong mani ");
        
        System.out.println("Enter Your Choice: ");
        int y = input.nextInt();
        
        
        if (y==1)
        {
            System.out.println(" Cheezy [10]");    
        int che;
        che = 10;
        
        System.out.println("Enter Quantity: ");
        int z = input.nextInt();
        
        int quan;
        quan = z * che;
        
        System.out.println("Total: " + quan);
        
        System.out.println("Enter Your Cash: ");
        int c = input.nextInt();
        
        while (c<quan)
        {
         System.out.println("Enter Your Cash: ");
        c = input.nextInt();
        }
        
        int tot;
        tot = c - quan;
         System.out.println("Your Total is: "+ tot);
        }
            
        else if (y==2)
        {
            System.out.println(" adobong mani [6]");    
        int mani;
        mani = 6;
        
        System.out.println("Enter Quantity: ");
        int z = input.nextInt();
        
        int quan;
        quan = z * mani;
        
        System.out.println("Total: " + quan);
        
        System.out.println("Enter Your Cash: ");
        int c = input.nextInt();
        
        while (c<quan)
        {
         System.out.println("Enter Your Cash: ");
        c = input.nextInt();
        }
        
        int tot;
        tot = c - quan;
         System.out.println("Your Total is: "+ tot);
        }
        }
            
        if (x==2)
        {
        System.out.println("[1] Zest-O  ");
        System.out.println("[2] C2 ");
        
        System.out.println("Enter Your Choice: ");
        int y = input.nextInt();
        
        
        if (y==1)
        {
            System.out.println(" Zest-O [12]");    
        int O;
        O = 12;
        
        System.out.println("Enter Quantity: ");
        int z = input.nextInt();
        
        int quan;
        quan = z * O;
        
        System.out.println("Total: " + quan);
        
        System.out.println("Enter Your Cash: ");
        int c = input.nextInt();
        
        while (c<quan)
        {
         System.out.println("Enter Your Cash: ");
        c = input.nextInt();
        }
        
        int tot;
        tot = c - quan;
         System.out.println("Your Total is: "+ tot);
        }
            
        else if (y==2)
        {
            System.out.println(" C2 [14]");    
        int C;
        C = 14;
        
        System.out.println("Enter Quantity: ");
        int z = input.nextInt();
        
        int quan;
        quan = z * C;
        
        System.out.println("Total: " + quan);
        
        System.out.println("Enter Your Cash: ");
        int c = input.nextInt();
        
        while (c<quan)
        {
         System.out.println("Enter Your Cash: ");
        c = input.nextInt();
        }
        
        int tot;
        tot = c - quan;
         System.out.println("Your Total is: "+ tot);
        }
        
        else System.out.println(" Invalid ");
        
        }      
        
    }
}
