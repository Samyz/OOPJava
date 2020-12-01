
import java.util.Scanner;

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
        Scanner input=new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int start=input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int time=input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        switch((start+time)%7)
        {
            case 0: System.out.print("Sunday");break;
            case 1: System.out.print("Monday");break;
            case 2: System.out.print("Tuesday");break;
            case 3: System.out.print("Wednesday");break;
            case 4: System.out.print("Thursday");break;
            case 5: System.out.print("Friday");break;
            case 6: System.out.print("Saturday");break;
            default: break;
        }
    }
    
}
