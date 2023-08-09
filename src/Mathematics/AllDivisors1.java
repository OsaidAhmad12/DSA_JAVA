package Mathematics;
import java.util.*;
public class AllDivisors1
{
    public void AllDivisors(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        AllDivisors1 obj=new AllDivisors1();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("All Divisors of "+n+"are:");
        obj.AllDivisors(n);
    }
}
