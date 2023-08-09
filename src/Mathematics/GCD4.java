package Mathematics;
import java.util.*;
public class GCD4
{
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String args[])
    {
        GCD4 obj=new GCD4();
        Scanner dis=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter the two numbers:");
        a=dis.nextInt();
        b=dis.nextInt();
        System.out.println("GCD of "+a+" and "+b+":"+obj.gcd(a,b));

    }
}
