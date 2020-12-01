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
public class Student extends Person {
    private Status stat;

    public Student() {
        super("Student");
    }

    
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + super.getName() + '}';
    }

    
}
