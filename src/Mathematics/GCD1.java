package Mathematics;
import java.util.*;
public class GCD1
{
    public int gcd(int a,int b)
    {
        int hcf=0;
        for(int i=1;i<=a*b;i++)
        {
            if(a%i==0 && b%i==0)
                hcf=i;
        }
        return hcf;
    }
    public static void main(String args[])
    {
        GCD1 obj=new GCD1();
        Scanner dis=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter the two numbers:");
        a=dis.nextInt();
        b=dis.nextInt();
        System.out.println("GCD of"+a+" and "+b+":"+obj.gcd(a,b));
    }
}
