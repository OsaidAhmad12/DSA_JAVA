package Bit_Manipulation;
import java.util.*;
public class two_odd_appearing_2
{
    public static void two_oddappearing_2nd(int m[])
    {
        int n=m.length;
        int x=m[0];
        for(int i=1;i<n;i++)
            x=x^m[i];
        int k=(x & (~(x-1)));
        int res1=0,res2=0;
        for(int i=0;i<n;i++)
        {
            if((m[i]&k)!=0)
                res1=res1^m[i];
            else
                res2=res2^m[i];
        }
        System.out.println(res1+" "+res2);
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of the array:");
        n=dis.nextInt();
        System.out.println("Enter the elements of the array");
        int m[]=new int[n];
        for(int i=0;i<n;i++)
            m[i]=dis.nextInt();
        System.out.println("Two odd occuring");
        two_oddappearing_2nd(m);

    }
}
