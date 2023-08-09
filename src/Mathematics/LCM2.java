package Mathematics;
import java.util.*;
public class LCM2
{
    public int lcm(int a,int b)
    {
        int res=Math.max(a,b);
        while(true)
        {
            if(res%a==0 && res%b==0)
            {
                break;
            }
            res++;
        }
        return res;
    }
    public static void main(String args[])
    {
        LCM2 obj=new LCM2();
        Scanner dis=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter the two numbers:");
        a=dis.nextInt();
        b=dis.nextInt();
        System.out.println("Lcm of"+a+" and "+b+":"+obj.lcm(a,b));
    }
}
