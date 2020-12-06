/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandhan_pranjal.nchooser;

import java.util.Scanner;

/** Assignment: U3A2P2-nChooseR
 * Date: Friday October 16th 2020
 * @author Pranjal Mandhan
 * Description: This program allows you to get values from the user and perform a Combination operation 
 */
public class Mandhan_PranjalNChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creating a varriable for the final answer
        int Choose;
        
        //Allowing the user to input values and retrieving them 
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements are there to choose from?");
        int intN = Integer.parseInt(scan.nextLine());
        System.out.println("How many elements do you want to choose from it");
        int intR = Integer.parseInt(scan.nextLine());
        
        // performing the operation 
        Choose = Fact(intN)/(Fact(intR)* Fact(intN-intR));
        
        //Displaying the Output/Anser
        System.out.println("There are " + Choose + " ways to choose " + intR + " elements from " + intN + " elements");        
        
    }
    // Creating a factorial method to allow factorials 
    static public int Fact (int f) {
        if (f <= 1)
            return 1;
        else
            return f * Fact(f-1);
    }
}
