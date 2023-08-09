package Mathematics;
import java.util.*;
public class prime2
{
    public boolean isPrime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        prime2 obj=new prime2();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number to check whether it is prime or not:");
        n=dis.nextInt();
        System.out.println(obj.isPrime(n));

    }
}
