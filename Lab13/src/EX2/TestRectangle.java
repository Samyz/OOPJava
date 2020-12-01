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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3,4);
        Rectangle rec2 = new Rectangle(4,3);
        Rectangle rec3 = new Rectangle(5,5);
        Rectangle rec4 = new Rectangle(4,3,"Green",true);
        System.out.println(rec1.compareTo(rec2) + " " + rec1.compareTo(rec3) + " " + rec3.compareTo(rec1));
        System.out.println(rec1.equals(rec3) + " " + rec1.equals(rec2) + " " + rec1.equals(rec4));
    }
}
