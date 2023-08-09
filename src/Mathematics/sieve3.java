package Mathematics;
import java.util.*;
public class sieve3
{
    public void sieve(int n)
    {
        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
            {
                System.out.print(i+" ");
                for(int j=i*i;j<=n;j=j+i)
                    isPrime[j]=false;
            }
        }

    }
    public static void main(String[] args)
    {
        sieve3 obj=new sieve3();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number upto which the prime numbers are to be printed:");
        n=dis.nextInt();
        System.out.println("All prime numbers upto "+n+" are:");
        obj.sieve(n);

    }
}
