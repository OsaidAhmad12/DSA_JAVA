package Mathematics;
import java.util.*;
public class primeDivisors1
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
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                int x=i;
                while(n%x==0)
                {
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
    }
    public static void main(String args[])
    {
        primeDivisors1 obj=new primeDivisors1();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number whose prime divisors have to be printed:");
        n=dis.nextInt();
        System.out.println("Prime Divisors:");
        obj.primeDivisors(n);

    }
}
