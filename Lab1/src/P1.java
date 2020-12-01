/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class P1 {
    public static void main(String[] args) {
        double totalTime=365*24*60*60;
        double birth=totalTime/7.0;
        double death=totalTime/13.0;
        double immigrant=totalTime/45.0;
        double totalPeople=312032486;
        for(int i=0;i<5;++i)
        {
            totalPeople=totalPeople+birth+immigrant-death;
            System.out.printf("%.2f\n",totalPeople);
        }
        //totalPeople=totalPeople+birth+immigrant-death;
        //System.out.println(totalPeople);
    }
}
