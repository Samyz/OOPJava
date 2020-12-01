/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import EX1.Triangle;
import java.util.Scanner;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        String color = input.next();
        boolean filled = input.nextBoolean();
        Triangle tri = new Triangle(side1, side2, side3);
        tri.setColor(color);
        tri.setFilled(filled);
        System.out.println(tri.getPerimeter() + " " + tri.getArea() + " " + tri.isFilled() + " " + tri.toString() + " " + tri.getColor());
    }
}
