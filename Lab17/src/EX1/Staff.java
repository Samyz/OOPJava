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
public class Staff extends Employee{
    private String title;

    public Staff() {
        super("Staff");
    }

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff{" + "name=" + super.getName() + '}';
    }
    
}
