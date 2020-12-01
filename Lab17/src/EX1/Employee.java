/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.util.Date;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class Employee extends Person{
    private String office;
    private double salary;
    private Date date_hired;

    public Employee() {
        super("Employee");
    }

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + super.getName() + '}';
    }
    
}
