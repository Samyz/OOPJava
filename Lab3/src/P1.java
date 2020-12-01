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
        int count=0,num=1;
        while(count<100)
        {
            if(isPrime(num))
            {
                if(isPalindome(num))
                {
                    System.out.print(num + " ");
                    count++;
                    if(count%10==0)
                        System.out.println();
                }
            }
            num++;
        }
    }
    
    public static boolean isPrime(int eiei)
    {
        int aiai=1;
        if(eiei==1)
            aiai=0;
        for(int i=2;i<eiei;i++)
        {
            if(eiei%i==0)
            {
                aiai=0;
                break;
            }
        }
        if(aiai==0)
            return false;
        else
            return true;
    }
    
    public static boolean isPalindome(int eiei)
    {
        String aiai=eiei + "";
        boolean uiui=true;
        if(aiai.length()>1)
        {
            int n=aiai.length()/2;
            for(int i=0,j=aiai.length()-1;i<n;i++,j--)
            {
                if(aiai.charAt(i)!=aiai.charAt(j))
                {
                    uiui=false;
                    break;
                }
            }
        }
        return uiui;
    }
}
