/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class EX1 {
    public static void main(String[] args) {
        int array[] = new int[100];
        Random rand = new Random();
        for(int i=0;i<100;i++){
            array[i] = rand.nextInt();
        }
        Scanner input = new Scanner(System.in);
        int Int = input.nextInt();
        try {
            System.out.println(Int + " " + array[Int]);
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("the message Out of Bounds.");
        }
    }
}
