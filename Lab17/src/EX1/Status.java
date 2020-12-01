/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class Status {
    private String stat[] = new String[]{"freshman","sophomore","junior","senior"};
    public String getStatus(){
        return stat[(int)(Math.random()*4)];
    }
}
