package Mathematics;
import java.util.*;
public class AllDivisors2
{
    public void printAllDivisors(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                if(i!=n/i)
                    System.out.print(n/i+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        AllDivisors2 obj=new AllDivisors2();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("All Divisors:");
        obj.printAllDivisors(n);
    }
}
