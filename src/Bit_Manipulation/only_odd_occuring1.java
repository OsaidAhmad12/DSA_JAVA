package Bit_Manipulation;
import java.util.*;
public class only_odd_occuring1
{
    public static void odd_ocurring(int m[])
    {
        int c=0;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m.length;j++)
            {
                if(m[i]==m[j])
                    c++;
            }
            if(c==1)
            {
                System.out.println(m[i]);
                break;
            }
            c=0;
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the size of the array:");
        n=dis.nextInt();
        System.out.println("Enter the elements of the array:");
        int m[]=new int[n];
        for (int i=0;i<n;i++)
            m[i]=dis.nextInt();
        System.out.println("Odd occuring element:");
        odd_ocurring(m);

    }

}
