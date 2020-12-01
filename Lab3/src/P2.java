
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
        System.out.print("Enter list1: ");
        String[] n1=input.nextLine().split(" ");
        System.out.print("Enter list2: ");
        String[] n2=input.nextLine().split(" ");
        int[] list1=new int[n1.length],list2=new int[n2.length];
        for(int i=0;i<n1.length;i++)
        {
            list1[i]=Integer.parseInt(n1[i]);
        }
        for(int i=0;i<n2.length;i++)
        {
            list2[i]=Integer.parseInt(n2[i]);
        }
        int[] finish=merge(list1,list2);
        System.out.print("The merged list is");
        for (int i : finish) {
            System.out.print(" " + i);
        }
    }
    public static int[] merge(int[] list1,int[] list2)
    {
        int[] haha = new int[list1.length+list2.length];
        for(int i=0,j=0,k=0;i<list1.length+list2.length;i++)
        {
            if(j==list1.length)
            {
                System.arraycopy(list2, k, haha, i, list2.length-k);
                break;
            }
            if(k==list2.length)
            {
                System.arraycopy(list1, j, haha, i, list1.length-j);
                break;
            }
            if(list1[j]<=list2[k]&&j<list1.length)
            {
                haha[i]=list1[j];
                j++;
            }
            else if(list1[j]>list2[k]&&k<list2.length)
            {
                haha[i]=list2[k];
                k++;
            }
        }
//        System.arraycopy(list1, 0, haha, 0, list1.length);
//        System.arraycopy(list2, 0, haha, list1.length, list2.length);
//        Arrays.sort(haha);
        return haha;
    }
}
