package Mathematics;
import java.util.*;
public class power2
{
    public int power(int x,int n)
    {
        if(n==0)
            return 1;
        return x*power(x,n-1);
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int x=0,n=0;
        System.out.println("Enter the number:");
        x=dis.nextInt();
        System.out.println("Enter the power:");
        n=dis.nextInt();
        power2 obj=new power2();
        System.out.println(x+" raised to the power "+n+":"+obj.power(x,n));
    }
}
