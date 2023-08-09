package Mathematics;
import java.util.*;
public class GCD2
{
    public int gcd(int a,int b)
    {
        int res=Math.min(a,b);
        while(res>0)
        {
            if(a%res==0 && b%res==0)
                return res;
            res--;
        }
        return res;
    }
    public static void main(String args[])
    {
        GCD2 obj=new GCD2();
        Scanner dis=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter the two numbers:");
        a=dis.nextInt();
        b=dis.nextInt();
        System.out.println("GCD of"+a+" and "+b+":"+obj.gcd(a,b));
    }
}
