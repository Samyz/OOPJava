/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sorrawat Wisutthiwan
 */
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int total=0;
        if(number>=1000||number<=0)
        {
            System.out.println("ERROR");
        }
        else 
        {
            for(int i=0;i<3;++i)
            {
                total+=number%10;
                number/=10;
            }
            System.out.println("The sum of the digits is " + total);
        }
    }
}
