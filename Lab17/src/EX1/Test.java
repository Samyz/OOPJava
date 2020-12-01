/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sorrawat Wisutthiwan
 */
public class Test {
    public static void main(String[] args) {
        try {
            test();
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void test() throws IOException{
        File file = new File("Lab17.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(file);
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();
//        fw.write(person.toString()+"\r\n");
//        fw.write(student.toString()+"\r\n");
//        fw.write(employee.toString()+"\r\n");
//        fw.write(faculty.toString()+"\r\n");
//        fw.write(staff.toString()+"\r\n");
//        fw.close();
        pw.println(person.toString());
        pw.println(student.toString());
        pw.println(employee.toString());
        pw.println(faculty.toString());
        pw.println(staff.toString());
        pw.close();
    }
}
