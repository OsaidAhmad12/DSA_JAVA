package Mathematics;
import java.util.*;
public class prime3
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
    public static void main(String args[])
    {
        prime3 obj=new prime3();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println(obj.isPrime(n));

    }
}
