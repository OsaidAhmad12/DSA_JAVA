package Mathematics;
import java.util.*;
public class power4
{
    public int power(int x,int n)
    {
        int res=1;
        while(n>0)
        {
            if(n%2!=0)
               res=res*x;
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0,x=0;
        System.out.println("Enter the number:");
        x=dis.nextInt();
        System.out.println("Enter the power:");
        n=dis.nextInt();
        power4 obj=new power4();
        System.out.println(x+" raised to the power "+n+":"+obj.power(x,n));

    }
}
