package Mathematics;
import java.util.*;
public class primeDivisors2
{
    public boolean isPrime(int n)
    {
        if(n==1)
            return false;
        if(n==2||n==3)
            return true;
        if(n%2==0||n%3==0)
            return false;
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0||n%(i+2)==0)
                return false;
        }
        return true;
    }
    public void primeDivisors(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(isPrime(i))
            {
                while(n%i==0)
                {
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
            if(n>1)
                System.out.print(n);
        }
    }
    public static void main(String args[])
    {
        primeDivisors2 obj=new primeDivisors2();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number whose prime divisors is to be found:");
        n=dis.nextInt();
        System.out.println("Prime Divisors:");
        obj.primeDivisors(n);
    }
}
