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
public class Faculty extends Employee{
    private long hour;
    private String rank;

    public Faculty() {
        super("Faculty");
    }

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty{" + "name=" + super.getName() + '}';
    }
    
}
