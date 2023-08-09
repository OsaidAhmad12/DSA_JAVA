package Mathematics;
import java.util.*;
public class power1
{
    public int power(int x,int n)
    {
        int res=1;
        for(int i=0;i<n;i++)
            res=res*x;
        return res;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the number:");
        int x=dis.nextInt();
        System.out.println("Enter the power to which the number is to be raised:");
        n=dis.nextInt();
        power1 obj=new power1();
        System.out.println(x+" raised to the power "+n+":"+obj.power(x,n));
    }
}
