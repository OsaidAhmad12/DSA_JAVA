package Mathematics;
import java.math.BigInteger;
import java.util.*;
public class GCD_built_in
{
    public static void main(String[] args)
    {
        Scanner dis=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Enter the two numbers:");
        a=dis.nextInt();
        b=dis.nextInt();
        BigInteger A=new BigInteger(String.valueOf(a));
        BigInteger B=new BigInteger(String.valueOf(b));
        BigInteger GCD=A.gcd(B);
        System.out.println("GCD of "+a+" and "+b+":"+GCD);
    }
}
