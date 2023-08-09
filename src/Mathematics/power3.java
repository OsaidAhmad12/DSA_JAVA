package Mathematics;
import java.util.*;
public class power3
{
    public int power(int x,int n)
    {
        if(n==0)
            return 1;
        int temp=power(x,n/2);
        temp=temp*temp;
        if(n%2==0)
            return temp;
        else
            return x*temp;
    }
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int x=0,n=0;
        System.out.println("Enter the number:");
        x=dis.nextInt();
        System.out.println("Enter the power:");
        n=dis.nextInt();
        power3 obj=new power3();
        System.out.println(x+" raised to the power "+n+":"+obj.power(x,n));
    }
}
