package Mathematics;
import java.util.*;
public class GCD3
{
    public int gcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public static void main(String args[])
    {
        GCD3 obj=new GCD3();
        Scanner dis=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter the numbers:");
        a=dis.nextInt();
        b=dis.nextInt();
        System.out.println("GCD of "+a+"and "+b+":"+obj.gcd(a,b));

    }
}
