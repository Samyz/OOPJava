
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
public class P4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n=input.nextInt();
        if(n<10)
        {
            for (int i = 0; i < n; i++) {
                for (int j = n+(n-i-1); j > 1+i; j--) {
                    System.out.printf(" ");
                }
                for (int j = i; j >= 0; j--) {
                    System.out.printf("%d ",j+1);
                }
                for (int j = 0; j < i; j++) {
                    System.out.printf("%d ",j+2);
                }
                System.out.printf("\n");
            }
        }
        else
        {
            for (int i = 0; i < n; i++) {
                for (int j = n+(n-i-1)*2; j > 1+i; j--) {
                    System.out.printf(" ");
                }
                for (int j = i; j >= 0; j--) {
                    System.out.printf("%2d ",j+1);
                }
                for (int j = 0; j < i; j++) {
                    System.out.printf("%2d ",j+2);
                }
                System.out.printf("\n");
            }
        }
    }
}
