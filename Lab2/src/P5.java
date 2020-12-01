
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
public class P5 {
    public static void main(String[] args) {
        int eiei=1,ohoh=3,count=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=input.nextInt();
        for (int i = 0;i < n;i ++)
        {
            if(i%2==0)
            {
                System.out.print(eiei + " ");
                eiei+=(2*count);
                count++;
            }
            else
            {
                System.out.print(ohoh + " ");
                ohoh+=3;
            }
        }
    }
}
