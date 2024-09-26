package Bit_Manipulation;
import java.util.*;
public class powerSet
{
    public static void power_set(String s,int n)
    {
        int psize=(1<<n);
        for(int i=0;i<psize;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                    System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the string:");
        String s=dis.next();
        System.out.println("Enter the size of the string:");
         n=dis.nextInt();
        power_set(s,n);
    }
}
