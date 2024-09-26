package Bit_Manipulation;
import java.util.*;
public class only_odd_occuring2
{
    public static int only_odd_occuring_2(int m[])
    {
        int res=m[0];
        for(int i=1;i<m.length;i++)
            res=res^m[i];
        return res;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of the array:");
        n=dis.nextInt();
        System.out.println("Enter the elements of the array:");
        int m[]=new int[n];
        for(int i=0;i<n;i++)
        {
            m[i]=dis.nextInt();
        }
        System.out.println("Only odd ocurring element:"+only_odd_occuring_2(m));
    }
}
