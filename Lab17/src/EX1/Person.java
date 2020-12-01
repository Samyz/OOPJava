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
public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person() {
        this("Person");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
}
