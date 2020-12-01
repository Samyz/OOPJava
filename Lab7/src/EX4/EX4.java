/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX4;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class EX4 {

    public static void main(String[] args) {
        File file = new File("Salary.txt");
        DecimalFormat f = new  DecimalFormat("###,###.00");
        try {
            Scanner input = new Scanner(file);
            double assistant = 0.0, associate = 0.0, full = 0.0;
            int Iassistant = 0, Iassociate = 0, Ifull = 0;
            while (input.hasNextLine()) {
                String s = input.next();
                s = input.next();
                s = input.next();
                double d = input.nextDouble();
                switch (s) {
                    case "assistant":
                        assistant += d;
                        Iassistant++;
                        break;
                    case "associate":
                        associate += d;
                        Iassociate++;
                        break;
                    case "full":
                        full += d;
                        Ifull++;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("Total salary for assistant professor is " + f.format(assistant));
            System.out.println("Total salary for associate professor is " + f.format(associate));
            System.out.println("Total salary for full professor is " + f.format(full));
            System.out.println("Total salary for all professors is " + f.format(assistant + associate + full));
            System.out.println("Average salary for assistant professor " + f.format(assistant/Iassistant));
            System.out.println("Average salary for associate professor " + f.format(associate/Iassociate));
            System.out.println("Average salary for full professor is " + f.format(full/Ifull));
            System.out.println("Average salary for all professors is " + f.format((assistant + associate + full)/(Iassistant + Iassociate + Ifull)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EX4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
