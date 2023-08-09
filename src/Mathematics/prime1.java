package Mathematics;
import java.util.*;
public class prime1
{
    public boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        return (c==2);
    }
    public static void main(String args[])
    {
        prime1 obj=new prime1();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number to check whether it is prime or not:");
        n=dis.nextInt();
        System.out.println(obj.isPrime(n));
    }
}
