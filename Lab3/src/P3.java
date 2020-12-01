
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
public class P3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int n=input.nextInt();
        int[][] array=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=(int)(Math.random()*2);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        int ohoh=0;
        for(int i=0;i<n;i++)
        {
            int eiei=array[i][0],aiai=1;
            for(int j=1;j<n;j++)
            {
                if(eiei!=array[i][j])
                {
                    aiai=0;
                    break;
                }
            }
            if(aiai==1)
            {
                ohoh++;
                System.out.printf("All %ds on row %d\n",array[i][0],i);
            }
        }
        if(ohoh==0)
        {
            System.out.println("No same numbers on a row");
        }
        ohoh=0;
        for(int i=0;i<n;i++)
        {
            int eiei=array[0][i],aiai=1;
            for(int j=1;j<n;j++)
            {
                if(eiei!=array[j][i])
                {
                    aiai=0;
                    break;
                }
            }
            if(aiai==1)
            {
                ohoh++;
                System.out.printf("All %ds on column %d\n",array[0][i],i);
            }
        }
        if(ohoh==0)
        {
            System.out.println("No same numbers on a column");
        }
        ohoh=1;
        int aiai=array[0][1];
        for(int i=2;i<n;i++)
        {
            if(aiai!=array[i-1][i])
            {
                ohoh=0;
                break;
            }
        }
        if(ohoh==1)
            System.out.printf("All %ds on row superdiagonal\n",aiai);
        else
            System.out.printf("No same numbers on the superdiagonal\n");
        ohoh=1;
        aiai=array[0][0];
        for(int i=1;i<n;i++)
        {
            if(aiai!=array[i][i])
            {
                ohoh=0;
                break;
            }
        }
        if(ohoh==1)
            System.out.printf("All %ds on row diagonal\n",aiai);
        else
            System.out.printf("No same numbers on the diagonal\n");
        ohoh=1;
        aiai=array[1][0];
        for(int i=2;i<n;i++)
        {
            if(aiai!=array[i][i-1])
            {
                ohoh=0;
                break;
            }
        }
        if(ohoh==1)
            System.out.printf("All %ds on row subdiagonal\n",aiai);
        else
            System.out.printf("No same numbers on the subdiagonal\n");
    }
}
