package Mathematics;
import java.util.*;
public class LCM1
{
    public int lcm(int a,int b)
    {
        int lcm=0;
        for(int i=1;i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm=i;
                break;
            }
        }
        return lcm;
    }
    public static void main(String args[])
    {
        LCM1 obj=new LCM1();
        Scanner dis=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter the numbers:");
        a=dis.nextInt();
        b=dis.nextInt();
        System.out.println("Lcm of"+a+" and "+b+":"+obj.lcm(a,b));

    }
}
