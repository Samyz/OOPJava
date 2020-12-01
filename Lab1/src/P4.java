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
public class P4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        float pounds=input.nextFloat();
        System.out.println("Enter weight in inches: ");
        float inches=input.nextFloat();
        float kilograms=pounds;
        kilograms*=0.45359237;
        float meters=inches;
        meters*=0.0254;
        float BMI;
        BMI=kilograms/(meters*meters);
        System.out.printf("%.4f",BMI);
    }
}
