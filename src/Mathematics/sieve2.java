package Mathematics;
import java.util.*;
public class sieve2
{
    public void sieve(int n)
    {
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i;j<=n;j=j+i)
                    isPrime[j]=false;
            }
        }
        System.out.println("All prime numbers upto "+n+"are:");
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number upto which the prime numbers are to be printed:");
        n=dis.nextInt();
        sieve2 obj=new sieve2();
        obj.sieve(n);
    }
}
