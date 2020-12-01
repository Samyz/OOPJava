
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
public class P2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int person=input.nextInt();
        int bot=(int)(Math.random()*3);
        System.out.print("The computer is ");
        switch(bot)
        {
            case 0:System.out.print("scissor.");break;
            case 1:System.out.print("rock.");break;
            case 2:System.out.print("paper.");break;
            default: break;
        }
        System.out.print(" You are ");
        if((person==0&&bot==0)||(person==1&&bot==1)||(person==2&&bot==2))
        {
            switch(person)
            {
                case 0:System.out.print("scissor too.");break;
                case 1:System.out.print("rock too.");break;
                case 2:System.out.print("paper too.");break;
                default: break;
            }
            System.out.println(" It is a draw");
        }
        else if((person==0&&bot==2)||(person==1&&bot==0)||(person==2&&bot==1))
        {
            switch(person)
            {
                case 0:System.out.print("scissor.");break;
                case 1:System.out.print("rock.");break;
                case 2:System.out.print("paper.");break;
                default: break;
            }
            System.out.println(" You won");
        }
        else
        {
            switch(person)
            {
                case 0:System.out.print("scissor.");break;
                case 1:System.out.print("rock.");break;
                case 2:System.out.print("paper.");break;
                default: break;
            }
            System.out.println(" You lose");
        }
    }
}
