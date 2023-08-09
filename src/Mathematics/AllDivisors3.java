package Mathematics;

import java.util.Scanner;

public class AllDivisors3
{
    public void allDivisors(int n)
    {
        int i;
        for(i=1;i*i<n;i++)
        {
            if(n%i==0)
                System.out.print(i+" ");
        }
        for(;i>=1;i--)
        {
            if(n%i==0)
                System.out.print((n/i)+" ");
        }
    }
    public static void main(String[] args)
    {
        AllDivisors3 obj=new AllDivisors3();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("All Divisors:");
        obj.allDivisors(n);
    }

}
