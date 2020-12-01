/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class EX3 {
    public static void main(String[] args) {
        File file = new File("Salary.txt");
        Random rand = new Random();
        String[] list = new String[]{"assistant","associate","full"};
        int lol;
        DecimalFormat f = new  DecimalFormat("##.00");
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            writer.write("");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(EX3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileWriter fw = new FileWriter(file,true);
            for(int i=1;i<=1000;i++){
                lol = rand.nextInt(3);
                fw.write("FirstName" + i + " LastName" + i + " " + list[lol]);
                switch(lol){
                    case 0:fw.write(" " + f.format(rand.nextDouble()*30000 + 50000));break;
                    case 1:fw.write(" " + f.format(rand.nextDouble()*50000 + 60000));break;
                    case 2:fw.write(" " + f.format(rand.nextDouble()*55000 + 75000));break;
                    default:break;
                }
                if(i!=1000)
                    fw.write("\r\n");
                //System.out.println(i);
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(EX3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
