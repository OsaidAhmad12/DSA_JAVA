package Bit_Manipulation;
import java.util.*;
public class two_odd_appearing_1
{
    public static void two_oddappearing_1(int m[])
    {
        int n=m.length,c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(m[i]==m[j])
                    c++;
            }
            if(c%2!=0)
                System.out.print(m[i]+" ");
            c=0;
        }
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
        two_oddappearing_1(m);

    }
}
