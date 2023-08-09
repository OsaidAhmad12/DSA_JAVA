package Mathematics;
import java.util.*;
public class factorial
{
    public int fact(int n)
    {
        int f=1;
        for(int i=2;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String args[])
    {
        factorial obj=new factorial();
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        n=dis.nextInt();
        System.out.println("Factorial of "+n+" is:"+obj.fact(n));

    }

}
