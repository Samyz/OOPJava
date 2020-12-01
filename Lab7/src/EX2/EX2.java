/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class EX2 {
    public static void main(String[] args) {
        try{
            new Triangle(1,7,9);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }
}
