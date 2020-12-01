
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class P3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String first=input.nextLine();
        System.out.print("Enter the second city: ");
        String second=input.nextLine();
        System.out.print("Enter the third city: ");
        String third=input.nextLine();
        int eiei=first.compareTo(second);
        int aiai=first.compareTo(third);
        int uiui=second.compareTo(third);
        System.out.print("The three cities in alphabetical order are ");
        if(eiei<0&&aiai<0&&uiui<0)
            System.out.println(first + " " + second + " " + third);
        else if(eiei<0&&aiai<0&&uiui>0)
            System.out.println(first + " " + third + " " + second);
        else if(eiei<0&&aiai>0)
            System.out.println(third + " " + first + " " + second);
        else if(eiei>0&&aiai>0&&uiui>0)
            System.out.println(third + " " + second + " " + first);
        else if(eiei>0&&aiai>0&&uiui<0)
            System.out.println(second + " " + third + " " + first);
        else if(eiei>0&&aiai<0)
            System.out.println(second + " " + first + " " + third);
        else
            System.out.println("Error");
    }
}
